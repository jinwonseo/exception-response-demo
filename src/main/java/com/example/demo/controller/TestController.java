package com.example.demo.controller;

import com.example.demo.common.exception.BaseRollbackException;
import com.example.demo.dto.BuilderPatternDto;
import com.example.demo.dto.StaticFactoryMethodDto;
import com.example.demo.dto.TestRequestDto;
import com.example.demo.exception.TestException;
import com.example.demo.model.TestModel;
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

    public StaticFactoryMethodDto staticFactoryMethodDto() {
        TestModel testModel = new TestModel("1", "2", "3");

        return StaticFactoryMethodDto.of(testModel);
    }

    public BuilderPatternDto builderPatternDto() {
        return BuilderPatternDto.builder()
                .property1("1")
                .property2("2")
                .property3("3")
                .build();
    }
}
