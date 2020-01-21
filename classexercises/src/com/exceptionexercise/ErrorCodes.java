package com.exceptionexercise;

public enum ErrorCodes {
    NAME_IS_NULL(1),
    AGE_NOT_IN_RANGE(2);

    final Integer id;

    ErrorCodes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%d %s", id, super.toString());
    }
}
