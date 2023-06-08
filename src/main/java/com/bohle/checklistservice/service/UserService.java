package com.bohle.checklistservice.service;

import com.bohle.checklistservice.entities.dto.UserDTO;
import com.bohle.checklistservice.entities.models.User;
import org.springframework.validation.annotation.Validated;

public interface UserService {

   User registerUser(UserDTO userDTO);


}
