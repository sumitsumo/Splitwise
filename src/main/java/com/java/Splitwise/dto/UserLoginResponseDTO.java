package com.java.Splitwise.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserLoginResponseDTO
{
    private String name;
    private String email;
    private int id;
    private List<UserFriendResponseDTO> friendlist;
    private List<GroupResponseDTO> grouplist;
}
