package com.bohle.checklistservice.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
@Getter
@Setter
public class UserDTO implements Serializable {
    @JsonProperty("user_name")
    @Size(min = 2, max = 50, message = "El campo 'nombre' admite entre 2 y 50 caracteres")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Ha ingresado un caracter invalido ")
    private String userName;

    @JsonProperty("user_email")
    @Size(min= 6, max = 100, message = "El email es invalido")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message = "Ha ingresado un email inválido")
    private String userEmail;

    @JsonProperty("password")
    @Size(min = 8, max = 16, message = "la contrasenia debe tener entre 8 y 16 caracteres")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,16}$", message = "La contraseña no cumple con los requisitos mínimos")
    private String password;

    @JsonProperty("active")
    private Boolean active = true;

}