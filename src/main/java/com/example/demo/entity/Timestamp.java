package com.example.demo.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
       this.updateAt=now;
    }
    @PreUpdate
    public void Onupdate(){
        LocalDataTime now=LocalDateTime.now();
        this.updateAt=now;
    }
}

