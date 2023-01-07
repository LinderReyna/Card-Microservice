package com.nttdata.card.microservice.model;

import lombok.Data;

@Data
public class BankCredit {
    private String creditCard;
    private Integer numberOfCredits;
}
