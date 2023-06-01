package com.bohle.checklistservice.entities.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Data

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("task_id")
    private Long id;

    @Column(name= "task_title")
    private String taskTitle;

    @Column(name = "description")
    private String description;

    @Column(nullable = false)
    private LocalDate deadLine;

    @Column(nullable = false)
    private String status;

    // Relación muchos a uno con la entidad Usuario
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
