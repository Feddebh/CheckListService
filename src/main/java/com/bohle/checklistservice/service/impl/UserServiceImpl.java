package com.bohle.checklistservice.service.impl;

import com.bohle.checklistservice.entities.dto.UserDTO;
import com.bohle.checklistservice.entities.models.User;
import com.bohle.checklistservice.mappers.UserMapper;
import com.bohle.checklistservice.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor

public class UserServiceImpl {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User registerUser(UserDTO candidateUserDto){

        log.info("Nuevo Usuario: " + candidateUserDto);
        User newUser = userMapper.userDtoToUser(candidateUserDto);
        User savedUser= userRepository.save(newUser);
        savedUser.setId(savedUser.getId());
        return savedUser;
    }
}
