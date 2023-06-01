package com.bohle.checklistservice.repositories;

import com.bohle.checklistservice.entities.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class UserRepository {

    @Repository
    public interface ClientRepository extends JpaRepository<User, Long> {

    }

}
