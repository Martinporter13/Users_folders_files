package com.codeclan.example.UsersFoldersFiles.repository;

import com.codeclan.example.UsersFoldersFiles.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
