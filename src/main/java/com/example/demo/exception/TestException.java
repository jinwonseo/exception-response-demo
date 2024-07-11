package com.example.demo.exception;

import com.example.demo.common.exception.BaseRollbackException;
import org.springframework.http.HttpStatus;

public class TestException extends BaseRollbackException {
    public TestException(String code, String reason) {
        super(HttpStatus.BAD_REQUEST, code, reason);
    }
}
