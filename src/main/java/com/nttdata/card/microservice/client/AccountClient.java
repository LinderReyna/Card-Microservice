package com.nttdata.card.microservice.client;

import com.nttdata.card.microservice.exception.NotFoundException;
import com.nttdata.card.microservice.model.Account;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

@Component
@ReactiveFeignClient(name = "account-microservice", url = "${account.service.url}", path = "${account.service.path}")
public interface AccountClient {

    @GetMapping(value = "/account/{id}")
    @CircuitBreaker(name = "AccountCircuitBreaker", fallbackMethod = "AccountByIDFallback")
    Mono<Account> findById(@PathVariable("id") String id);

    @Slf4j
    final class LogHolder
    {}
    default Mono<Account> AccountByIDFallback(String id, Throwable e) {
        LogHolder.log.error("failure Account-Microservice: " + e.getMessage());
        throw new NotFoundException("failure Account-Microservice: verify account or try later");
    }
}
