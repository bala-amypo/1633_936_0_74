package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.*;


@Entity
@Data

public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void Oncreated(){
        LocalDataTime now=LocalDateTime.now();
       this.createdAt=now;
       
    }
    @PreUpdate
    public void Onupdate(){
        LocalDataTime now=LocalDateTime.now();
        this.updateAt=now;
    }
}

