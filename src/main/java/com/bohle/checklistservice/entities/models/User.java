package com.bohle.checklistservice.entities.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", unique = true, length = 25)
    private String userName;

    @Column(name = "user_email", unique = true)
    private String userEmail;

    @Column(name= "password")
    private String password;

    @Column(name = "active")
    private Boolean active;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Checklist> checklists;

}
