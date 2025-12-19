package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Service
public class ValidationServiceImpl  implements ValidationService{
@Autowired ValidationRepo student; 

@Override
public ValidationEntity postData(ValidationEntity stu){
    return student.save(stu);
}
@Override
public ValidationEntity getStudentById(Integer id){
    return repo.findById(id).orElseThrow(()->new ValidationException("Invalid Id"+id));
}
}






















































































