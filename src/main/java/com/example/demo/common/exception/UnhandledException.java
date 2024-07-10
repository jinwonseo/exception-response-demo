package com.example.demo.common.exception;

import org.springframework.http.HttpStatus;

public class UnhandledException extends BaseRollbackException{
    private UnhandledException(String reason) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, "unhandled", reason);
    }

    public static UnhandledException of(Throwable t) {
        return new UnhandledException(t.getMessage());
    }
}
