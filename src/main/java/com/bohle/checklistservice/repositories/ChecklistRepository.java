package com.bohle.checklistservice.repositories;

import com.bohle.checklistservice.entities.models.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class ChecklistRepository {

    @Repository
    public interface ProductRepository extends JpaRepository<Checklist, Long> {

    }

}
