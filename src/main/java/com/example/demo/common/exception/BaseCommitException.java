package com.example.demo.common.exception;

import org.springframework.http.HttpStatusCode;

public class BaseCommitException extends BaseException {
    public BaseCommitException(HttpStatusCode httpStatusCode, String code, String reason) {
        super(httpStatusCode, code, reason);
    }
}
