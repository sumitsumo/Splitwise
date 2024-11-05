package com.java.Splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Currency;

@Getter
@Setter
@Entity
public class SettlementTransaction extends BaseModel
{
    @ManyToOne
    private User borrower;
    @ManyToOne
    private User lendor;
    private Double amount;
    private Currency currency;
}
