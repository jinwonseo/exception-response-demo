package com.example.demo.common.aop;

import com.example.demo.common.dto.ExceptionResponse;
import com.example.demo.common.exception.BaseCommitException;
import com.example.demo.common.exception.BaseRollbackException;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order
public class RestControllerAdvisor {
    @ExceptionHandler(BaseCommitException.class)
    public ResponseEntity<ExceptionResponse> baseCommitException(BaseCommitException baseCommitException) {
        return ResponseEntity.status(baseCommitException.getHttpStatusCode())
                .body(ExceptionResponse.of(baseCommitException));
    }

    @ExceptionHandler(BaseRollbackException.class)
    public ResponseEntity<ExceptionResponse> baseRollbackException(BaseRollbackException baseRollbackException) {
        return ResponseEntity.status(baseRollbackException.getHttpStatusCode())
                .body(ExceptionResponse.of(baseRollbackException));
    }
}
