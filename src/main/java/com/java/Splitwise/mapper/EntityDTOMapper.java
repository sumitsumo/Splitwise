package com.java.Splitwise.mapper;

import com.java.Splitwise.dto.GroupResponseDTO;
import com.java.Splitwise.dto.UserFriendResponseDTO;
import com.java.Splitwise.dto.UserLoginResponseDTO;
import com.java.Splitwise.entity.Group;
import com.java.Splitwise.entity.User;

import java.util.ArrayList;
import java.util.List;

public class EntityDTOMapper
{
    public static UserLoginResponseDTO toDTO(User user)
    {
        UserLoginResponseDTO responseDTO = new UserLoginResponseDTO();
        responseDTO.setId(user.getId());
        responseDTO.setEmail(user.getEmail());
        responseDTO.setName(user.getName());
        //conversion of user friends to friendlist
        List<UserFriendResponseDTO> friendList = new ArrayList<>();
        for(User friend : user.getFriends())
                friendList.add(toFriendDTO(friend));
        responseDTO.setFriendlist(friendList);
        //conversion of group to groupresponsedto
        List<GroupResponseDTO> groupList = new ArrayList<>();
        for(Group group : user.getGroups())
            groupList.add(toGroupDTO(group));
        responseDTO.setGrouplist(groupList);
        return responseDTO;
    }

    public static UserFriendResponseDTO toFriendDTO(User user)
    {
        UserFriendResponseDTO responseDTO = new UserFriendResponseDTO();
        responseDTO.setId(user.getId());
        responseDTO.setName(user.getName());
        return responseDTO;
    }

    public static GroupResponseDTO toGroupDTO(Group group)
    {
        GroupResponseDTO responseDTO = new GroupResponseDTO();
        responseDTO.setId(group.getId());
        responseDTO.setGroup(group);
        return responseDTO;
    }
}
