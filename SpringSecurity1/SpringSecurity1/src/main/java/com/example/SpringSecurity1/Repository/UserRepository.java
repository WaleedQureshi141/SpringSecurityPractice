package com.example.SpringSecurity1.Repository;

import com.example.SpringSecurity1.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
