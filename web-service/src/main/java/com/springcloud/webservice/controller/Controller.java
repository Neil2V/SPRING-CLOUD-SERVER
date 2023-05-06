package com.springcloud.webservice.controller;

import com.springcloud.webservice.entity.User;
import com.springcloud.webservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String hello(){
        return "Hola ";
    }
    @GetMapping("/hello/{id}")
    public String helloStudent(@PathVariable("id") Long id){
        return "Hola "+ userRepository.findById(id).get().getNombre();
    }

    @GetMapping("/hello/student")
    public List<User> getStudent(){
        return userRepository.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<?> createStudent(@RequestBody User user){
        return new ResponseEntity(userRepository.save(user), HttpStatus.CREATED);
    }
}
