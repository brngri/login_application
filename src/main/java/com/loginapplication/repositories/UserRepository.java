package com.loginapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginapplication.domain.user.User;

public interface UserRepository extends JpaRepository<User, String> {
    
}
