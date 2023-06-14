package com.bohle.checklistservice.entities.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "users")
@JsonPropertyOrder({"id", "user_name", "user_email", "password", "active"})
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", unique = true, length = 25)
    private String userName;

    @Column(name = "user_email", unique = true)
    private String userEmail;

    @Column(name = "password")
    private String password;

    @Column(name = "active", nullable = false, columnDefinition = "boolean default true")
    private boolean active = true;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Checklist> checklists; //Deberia ver la lista de tareas que tiene un usuario directamente

}
