package com.example.demo.common.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatusCode;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
class BaseException extends RuntimeException {
    private HttpStatusCode httpStatusCode;
    private String code;
    private String reason;
}
