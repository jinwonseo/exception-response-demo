package com.example.demo.controller;

import com.example.demo.common.exception.BaseRollbackException;
import com.example.demo.dto.TestRequestDto;
import com.example.demo.exception.TestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @PostMapping("/")
    public String test(@RequestBody TestRequestDto dto) {
        return dto.getTest();
    }

    @PostMapping("/exceptions")
    public String exceptionTest() {
        throw new TestException("test", "test");
    }
}
