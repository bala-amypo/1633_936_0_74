package com.example.demo.entity

import java.

@Entity
public class StudentEntity{
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String createAt;

    public void setId(Integer){
        this.id=id;
    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Date getCreateAt(){
        return CreacteAt;
    }
    public void setCreateAt(Date creatAt){
        this.createAt = createAt;
    }
    public void StudentEntity(){
        
    }
    public StudentEntity(Integer id,String name,String email,String creatAt){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.creatAt = creatAt; 
    }
}