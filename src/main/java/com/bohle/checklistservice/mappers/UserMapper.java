package com.bohle.checklistservice.mappers;

import com.bohle.checklistservice.entities.dto.UserDTO;
import com.bohle.checklistservice.entities.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface UserMapper {

    User userDtoToUser(UserDTO userDTO);

    void updateUserFromDto(UserDTO userDTO, @MappingTarget User user);


}
