package com.example.demo.dto;

import com.example.demo.model.TestModel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class StaticFactoryMethodDto {
    private String property1;
    private String property2;
    private String property3;

    private StaticFactoryMethodDto(String property1, String property2, String property3) {
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
    }

    public static StaticFactoryMethodDto of(TestModel testModel) {
        return new StaticFactoryMethodDto(
                testModel.getProperty1(),
                testModel.getProperty2(),
                testModel.getProperty3()
        );
    }
}
