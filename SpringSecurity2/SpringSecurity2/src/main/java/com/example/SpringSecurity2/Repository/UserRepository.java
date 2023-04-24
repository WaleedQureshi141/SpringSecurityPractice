package com.example.SpringSecurity2.Repository;

import com.example.SpringSecurity2.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{
    User findByUsername(String username);
}
