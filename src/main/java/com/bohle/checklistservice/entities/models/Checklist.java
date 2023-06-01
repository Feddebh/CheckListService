package com.bohle.checklistservice.entities.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "checklists")
@Data
public class Checklist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

}
