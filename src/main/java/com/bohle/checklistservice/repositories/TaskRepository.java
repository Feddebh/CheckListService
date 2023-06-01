package com.bohle.checklistservice.repositories;

import com.bohle.checklistservice.entities.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class TaskRepository {

    @Repository
    public interface ProductRepository extends JpaRepository<Task, Long> {
    }

}
