package com.bohle.checklistservice.controllers;

import com.bohle.checklistservice.entities.dto.UserDTO;
import com.bohle.checklistservice.entities.models.User;
import com.bohle.checklistservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.control.MappingControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("v1/users")
@RequiredArgsConstructor

public class UserController {

   private final UserService userService;
@PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> registerUser(@RequestBody UserDTO candidateUserDto) {
    System.out.println("Received User DTO: " + candidateUserDto); // Mensaje de depuración
    return ResponseEntity.status(HttpStatus.CREATED).body(userService.registerUser(candidateUserDto));
}

}
