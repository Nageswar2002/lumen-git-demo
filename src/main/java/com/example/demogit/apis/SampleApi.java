package com.example.demogit.apis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {
    @GetMapping
    public ResponseEntity<String> get()
    {
        return ResponseEntity.ok("hello from sample mmmmm");
    }
}
