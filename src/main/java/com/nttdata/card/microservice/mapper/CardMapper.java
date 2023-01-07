package com.nttdata.card.microservice.mapper;

import com.nttdata.card.microservice.model.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {
    Card toModel(com.nttdata.card.microservice.domain.Card card);
    com.nttdata.card.microservice.domain.Card toDocument(Card card);
    Card copy(Card card);
}
