package com.codeclan.example.UsersFoldersFiles.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "extention")
    private String extention;

    @Column(name = "size")
    private int size;



    @JsonIgnoreProperties(value = "files")
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;


    public File(String name, String extention, int size, Folder folder) {
        this.name = name;
        this.extention = extention;
        this.size = size;
        this.folder = folder;
    }

    public File() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }


}




