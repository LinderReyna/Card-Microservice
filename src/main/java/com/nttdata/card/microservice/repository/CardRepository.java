package com.nttdata.card.microservice.repository;

import com.nttdata.card.microservice.domain.Card;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CardRepository extends ReactiveMongoRepository<Card, String> {
    Flux<Card> findAllByTitularId(String customerId);
    Mono<Card> findByNumberCardOrCvv(String numberCard, String cvv);
}
