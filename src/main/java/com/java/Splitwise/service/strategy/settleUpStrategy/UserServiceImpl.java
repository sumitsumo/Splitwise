package com.java.Splitwise.service.strategy.settleUpStrategy;

import com.java.Splitwise.entity.User;
import com.java.Splitwise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    UserRepository userRepository;
    @Override
    public User signup(String name, String email, String password) {
        User user = new User();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(encoder.encode(password));
        return userRepository.save(user);
    }
}
