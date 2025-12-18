package com.exmaple.demo.Entity
import jakarta.persistence.Entity;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String username;
    private String
}