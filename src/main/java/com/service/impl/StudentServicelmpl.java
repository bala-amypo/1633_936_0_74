package com.example.demo.service.Impl;

import org.springframework.stereotype.service;
@service
public class Studentserverimpl implement StudentService{
    @Autowired StudentRepository Student;
    
    
}
@Override
public String DeleteDtata(            )





















@Override
public StudentEntity getData(int id){
    return student.findById(id).orElse(null);

}