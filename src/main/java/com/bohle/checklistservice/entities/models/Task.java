package com.bohle.checklistservice.entities.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

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

    @Column(name = "description", length = 150)
    private String description;

    @Column(nullable = false)
    private LocalDateTime deadLine;

    @Column(nullable = false)
    private String status;

    // Relación muchos a uno con la entidad Usuario
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<Checklist> checklists;

}
