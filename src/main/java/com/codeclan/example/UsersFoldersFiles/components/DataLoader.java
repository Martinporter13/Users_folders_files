package com.codeclan.example.UsersFoldersFiles.components;

import com.codeclan.example.UsersFoldersFiles.models.File;
import com.codeclan.example.UsersFoldersFiles.models.Folder;
import com.codeclan.example.UsersFoldersFiles.models.User;
import com.codeclan.example.UsersFoldersFiles.repository.FileRepository;
import com.codeclan.example.UsersFoldersFiles.repository.FolderRepository;
import com.codeclan.example.UsersFoldersFiles.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;



    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User martin = new User("Martin Porter");
        userRepository.save(martin);

        User billy = new User ("Billy Bruce");
        userRepository.save(billy);

        Folder folder1 = new Folder("Folder 1", martin);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Folder 2", billy);
        folderRepository.save(folder2);

        File example = new File("example", "txt",10, folder1);
        fileRepository.save(example);

        File example2 = new File("example 2", "ppt", 12, folder2);
        fileRepository.save(example2);

        folder1.addFile(example);
        folder1.addFile(example2);
        folderRepository.save(folder1);

//        example2.addFolder(folder2);
//        example2.addFolder(folder1);
//        fileRepository.save(example2);

        Optional<User> foundUser = userRepository.findById(2L);
    }


}

