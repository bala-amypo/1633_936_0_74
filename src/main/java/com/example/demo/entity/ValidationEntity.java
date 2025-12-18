package com.exmaple.demo.Entity
import jakarta.persistence.Entity;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String username;
    private String email;
    private String password;
    private int age;
    @size(min=2,max=10,message="must be 2 to 10 character")
    private String username;
    @Email(message = "Email is not valid")
    private String email;
    @
    private String password;
    private int age;
}