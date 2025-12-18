package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity  stu){
        return ser.postData(stu);
    }
}


package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Date created;
    public Integer getid(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public Date getCreated(){
        return created;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setCreated(Date created){
        this.created=created;
    }
    public StudentEntity(Integer id,String username,String email,String password,Date created){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.created=created;
    }
    public StudentEntity(){

    }


}