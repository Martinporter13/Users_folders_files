package com.codeclan.example.UsersFoldersFiles.repository;

import com.codeclan.example.UsersFoldersFiles.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
