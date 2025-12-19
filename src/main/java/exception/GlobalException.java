package com.example.exception;

import org.springframework.http.;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepo;
import com.example.demo.service.ValidationService;
import com.example.demo.exception.ValidationException;
import java.util.List;

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






















































































