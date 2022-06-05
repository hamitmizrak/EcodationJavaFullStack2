package com.hamitmizrak.project2;


import com.hamitmizrak.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin //CORS: Cross Origin Resource Sharing
public class _3_TeacherRestController {

    @Autowired
    _2_TeacherRepository repository;

    //http://localhost:8080/api/v1/cors
    @GetMapping("/cors")
    public String message(){
        return "Merhabalar Ben Rest API'den geldim";
    }


    ///////////////////////////////////////////////////////////////////////

    //SAVE
    //http://localhost:8080/api/v1/post
    @PostMapping("/post")
    public ResponseEntity<_1_TeacherEntity> getPost( @RequestBody _1_TeacherEntity teacherEntity){
        repository.save(teacherEntity);
        return ResponseEntity.ok(teacherEntity);
    }


    //PUT
    //http://localhost:8080/api/v1/put
    @PutMapping("/put")
    public ResponseEntity<Void> getPut( @RequestBody _1_TeacherEntity teacherEntity){
        repository.save(teacherEntity);
        return ResponseEntity.ok().build();
    }


    //DELETE
    //http://localhost:8080/api/v1/delete/2
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> getDelete(@PathVariable(name="id") Long id){
        _1_TeacherEntity teacherEntity=repository.findById(id).orElseThrow(()->new ResourceNotFoundException(id+" teach id bulunmadı"));
        repository.delete(teacherEntity);
        return ResponseEntity.ok().build();
    }

    //FIND
    //http://localhost:8080/api/v1/get/4
    @GetMapping("/get/{id}")
    public ResponseEntity<_1_TeacherEntity> getTeacher(@PathVariable(name="id") Long id){
        _1_TeacherEntity teacherEntity=repository.findById(id).orElseThrow(()->new ResourceNotFoundException(id+" teach id bulunmadı"));
        return ResponseEntity.ok(teacherEntity);
    }

    //LIST
    //http://localhost:8080/api/v1/list
    @GetMapping("/list")
    public ResponseEntity<List<_1_TeacherEntity>> getList(){
      List<_1_TeacherEntity> entityList=repository.findAll();
        return ResponseEntity.ok(entityList);
    }

}
