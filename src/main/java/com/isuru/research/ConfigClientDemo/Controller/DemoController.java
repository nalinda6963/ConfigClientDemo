package com.isuru.research.ConfigClientDemo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Value("${foo}")
    private String foo;

    @Value("${test}")
    private String test;

    @GetMapping (value = "/properties")
    public ResponseEntity<?> getProperties(){
        return ResponseEntity.ok(Arrays.asList(foo, test));
    }
}
