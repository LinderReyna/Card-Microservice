package com.nttdata.card.microservice.service;

import com.nttdata.card.microservice.model.Card;
import com.nttdata.card.microservice.model.Consume;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.channels.FileChannel;

public interface CardService {
    Mono<Card> save(Mono<Card> card);
    Mono<Void> deleteById(String id);
    Mono<Card> findById(String id);
    Flux<Card> findAll();
    Mono<Card> update(Mono<Card> card, String id);
    Flux<Card> findAllByCustomer(String customerId);
    Mono<Card> findByNumber(String number);
    Mono<Consume> saveConsume(String cardId, Mono<Consume> consume);
    Flux<Boolean> validDebt(String message);
}
