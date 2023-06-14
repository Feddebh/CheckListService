package com.bohle.checklistservice.mappers;

import com.bohle.checklistservice.entities.dto.UserDTO;
import com.bohle.checklistservice.entities.models.User;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T03:04:51-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Ubuntu)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userDtoToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( userDTO.getUserName() );
        user.setUserEmail( userDTO.getUserEmail() );
        user.setPassword( userDTO.getPassword() );
        if ( userDTO.getActive() != null ) {
            user.setActive( userDTO.getActive() );
        }

        return user;
    }

    @Override
    public void updateUserFromDto(UserDTO userDTO, User user) {
        if ( userDTO == null ) {
            return;
        }

        user.setUserName( userDTO.getUserName() );
        user.setUserEmail( userDTO.getUserEmail() );
        user.setPassword( userDTO.getPassword() );
        if ( userDTO.getActive() != null ) {
            user.setActive( userDTO.getActive() );
        }
    }
}
