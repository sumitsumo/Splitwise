package com.java.Splitwise.service.strategy.settleUpStrategy;

import com.java.Splitwise.entity.User;

public interface UserService
{
    User signup(String name, String email, String password);
}
