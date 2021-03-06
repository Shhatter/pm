package com.example.commons.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class ErrorStubException extends RuntimeException {

    private final Enum<?> errorException;

    private final HttpStatus status;

    protected ErrorStubException(Enum<?> errorException, HttpStatus status) {
        this.errorException = errorException;
        this.status = status;
    }

    protected ErrorStubException(Enum<?> errorException, HttpStatus status, Throwable e) {
        this.errorException = errorException;
        this.status = status;
        super.initCause(e);
    }
}
