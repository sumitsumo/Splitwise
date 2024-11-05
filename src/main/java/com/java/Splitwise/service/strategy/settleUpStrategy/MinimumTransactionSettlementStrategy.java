package com.java.Splitwise.service.strategy.settleUpStrategy;

import com.java.Splitwise.entity.Expense;
import com.java.Splitwise.entity.SettlementTransaction;

import java.util.List;

public class MinimumTransactionSettlementStrategy implements  SettleUpStrategy
{

    @Override
    public List<SettlementTransaction> getSettlementTranscations(List<Expense> expense) {
        return null;
    }
}
