package com.codeclan.example.UsersFoldersFiles.repository;

import com.codeclan.example.UsersFoldersFiles.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
