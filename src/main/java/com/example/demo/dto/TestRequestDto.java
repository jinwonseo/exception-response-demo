package com.example.demo.dto;

import com.example.demo.common.dto.BaseDto;

public class TestRequestDto extends BaseDto {
    private String test2;

    public TestRequestDto() {
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }
}
