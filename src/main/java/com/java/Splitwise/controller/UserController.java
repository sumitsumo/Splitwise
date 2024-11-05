package com.java.Splitwise.controller;

//import com.java.Splitwise.dto.UserRegistrationDTO;
import com.java.Splitwise.dto.UserRegistrationRequestDTO;
import com.java.Splitwise.entity.User;
import com.java.Splitwise.exceptions.UserRegistrationInvalidDataException;
import com.java.Splitwise.mapper.EntityDTOMapper;
import com.java.Splitwise.service.strategy.settleUpStrategy.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;
    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody UserRegistrationRequestDTO userRegistrationRequestDTO)
    {
        validateUserRegistrationDTO(userRegistrationRequestDTO);
        User saveUser=userService.signup(userRegistrationRequestDTO.getName(),userRegistrationRequestDTO.getEmail(),userRegistrationRequestDTO.getPassword());
        return ResponseEntity.ok(
                EntityDTOMapper.toDTO(saveUser)
        );
    }
    private void validateUserRegistrationDTO(UserRegistrationRequestDTO userRegistrationRequestDTO)
    {
        if((userRegistrationRequestDTO.getEmail()==null)||
                (userRegistrationRequestDTO.getName()==null)||
                (userRegistrationRequestDTO.getPassword()==null)
        )
            throw new UserRegistrationInvalidDataException("Invalid Signup details");

    }
}
