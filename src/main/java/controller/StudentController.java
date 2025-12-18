Package com.example.demo.services;

import com.example.demo 
import org.springframework.web.blind.annotation.GetMapping;
@RestController
public class Studentcontroller{
@Autowired Studentservices services;
@postMapping("/post")
public StudentEntity postval(@RequestBody StudentEntity entity){
    return services.postdata(entity);
}
@GetMapping("/get")
public List<StudentEntity>getval(){
    return services.getAllData()
}
}