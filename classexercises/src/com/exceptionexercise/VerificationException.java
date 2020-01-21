package com.exceptionexercise;

import java.util.Objects;

public class VerificationException extends Exception {
    private String message;
    private ErrorCodes errorCode;

    public VerificationException(ErrorCodes errorCode) {
        this.errorCode = errorCode;
    }

    public VerificationException(String message, ErrorCodes errorCode) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "VerificationException{" +
                "message='" + message + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VerificationException that = (VerificationException) o;
        return errorCode == that.errorCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode);
    }
}
