package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BuilderPatternDto {
    private String property1;
    private String property2;
    private String property3;

    @Builder
    public BuilderPatternDto(String property1, String property2, String property3) {
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
    }
}
