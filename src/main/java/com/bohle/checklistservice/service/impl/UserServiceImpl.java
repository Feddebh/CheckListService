package com.bohle.checklistservice.service.impl;

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


}
