package com.example.demo.common.exception;

import org.springframework.http.HttpStatusCode;

public class BaseRollbackException extends BaseException {
    public BaseRollbackException(HttpStatusCode httpStatusCode, String code, String reason) {
        super(httpStatusCode, code, reason);
    }
}
