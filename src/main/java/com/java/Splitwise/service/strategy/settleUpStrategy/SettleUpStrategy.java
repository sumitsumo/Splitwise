package com.java.Splitwise.service.strategy.settleUpStrategy;

import com.java.Splitwise.entity.Expense;
import com.java.Splitwise.entity.SettlementTransaction;

import java.util.List;

public interface SettleUpStrategy
{
    List<SettlementTransaction> getSettlementTranscations(List<Expense>expense);
}
