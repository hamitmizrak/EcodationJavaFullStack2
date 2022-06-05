package com.hamitmizrak.project2;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

@CrossOrigin //CORS: Cross Origin Resource Sharing
public class _3_TeacherRestController {

    //http://localhost:8080/api/v1/cors
    @GetMapping("/cors")
    public String message(){
        return "Merhabalar Ben Rest API'den geldim";
    }

}
