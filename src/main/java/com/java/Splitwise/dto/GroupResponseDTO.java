package com.java.Splitwise.dto;

import com.java.Splitwise.entity.Group;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupResponseDTO
{
    private int id;
    private Group group;
}
