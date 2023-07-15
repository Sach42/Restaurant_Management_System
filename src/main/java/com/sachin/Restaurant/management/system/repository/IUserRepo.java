package com.sachin.Restaurant.management.system.repository;

import com.sachin.Restaurant.management.system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
