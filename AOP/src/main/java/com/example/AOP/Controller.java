package com.example.AOP;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/get")
    public ResponseEntity<String>getIt()
    {
        return new ResponseEntity<>("Okay",HttpStatus.OK);
    }
    @GetMapping("/exception")
    public ResponseEntity<String>getTheValue() throws Exception
    {
        throw new Exception("Error");
    }
}
