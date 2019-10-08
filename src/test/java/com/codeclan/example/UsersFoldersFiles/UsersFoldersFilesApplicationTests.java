package com.codeclan.example.UsersFoldersFiles;

import com.codeclan.example.UsersFoldersFiles.models.File;
import com.codeclan.example.UsersFoldersFiles.models.Folder;
import com.codeclan.example.UsersFoldersFiles.repository.FileRepository;
import com.codeclan.example.UsersFoldersFiles.repository.FolderRepository;
import com.codeclan.example.UsersFoldersFiles.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersFoldersFilesApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndFolderThenSave() {

		Folder folder1 = new Folder("Folder1");
		folderRepository.save(folder1);
		File example = new File("example", "ppt", 10, folder1);
		fileRepository.save(example);

	}
}