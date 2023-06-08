package com.bohle.checklistservice.repositories;

import com.bohle.checklistservice.entities.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface UserRepository extends JpaRepository<User, Long> {

    }

