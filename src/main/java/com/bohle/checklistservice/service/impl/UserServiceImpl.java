package com.bohle.checklistservice.service.impl;

import com.bohle.checklistservice.entities.dto.UserDTO;
import com.bohle.checklistservice.entities.models.User;
import com.bohle.checklistservice.mappers.UserMapper;
import com.bohle.checklistservice.repositories.UserRepository;
import com.bohle.checklistservice.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@Data

public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final UserMapper userMapper;

    public User registerUser(UserDTO candidateUserDto){

        User newUser = userMapper.userDtoToUser(candidateUserDto);
        User savedUser= userRepository.save(newUser);
        savedUser.setId(savedUser.getId());

        return savedUser;
    }

    @Override
    public User modifyUser(Long userId, UserDTO modifiedUserDTO) {
        User existingUser =  userRepository.findUserById(userId).orElseThrow(
                () -> new RuntimeException(
                                "No se encuentra el usuario con ID: " + userId));
        userMapper.updateUserFromDto(modifiedUserDTO, existingUser);
        return userRepository.save(existingUser);
    }

}
