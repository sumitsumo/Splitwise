package com.java.Splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity(name="SPLITWISE_GROUP")
public class Group extends BaseModel
{
    private String name;
    @ManyToOne
    private User createdBy;
    private LocalDateTime createdDate;
    private double totalAmountSpent;
    @ManyToMany
    private  List<User> members;
    @OneToMany
    private List<Expense> expenses;
    @OneToMany
    private List<SettlementTransaction> settlementTransactions;
}
