package com.codewithme.fullstack_backend.repository;

import com.codewithme.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
