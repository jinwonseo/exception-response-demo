package com.example.demo.common.dto;

import com.example.demo.common.exception.BaseCommitException;
import com.example.demo.common.exception.BaseRollbackException;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class ExceptionResponse extends BaseResponse {
    private final ExceptionContext exception;

    private ExceptionResponse(String code, String reason) {
        super(false);
        this.exception = new ExceptionContext(code, reason);
    }

    public static ExceptionResponse of(BaseCommitException baseCommitException) {
        return new ExceptionResponse(baseCommitException.getCode(), baseCommitException.getReason());
    }

    public static ExceptionResponse of(BaseRollbackException baseRollbackException) {
        return new ExceptionResponse(baseRollbackException.getCode(), baseRollbackException.getReason());
    }

    private record ExceptionContext(String code, String reason) { };
}
