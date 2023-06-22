package com.bohle.checklistservice.service;

import com.bohle.checklistservice.entities.dto.UserDTO;
import com.bohle.checklistservice.entities.models.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.validation.annotation.Validated;

public interface UserService {

   User registerUser(@Valid UserDTO userDTO);

   User modifyUser(@Positive Long userId, @Valid UserDTO userDTO);


}
