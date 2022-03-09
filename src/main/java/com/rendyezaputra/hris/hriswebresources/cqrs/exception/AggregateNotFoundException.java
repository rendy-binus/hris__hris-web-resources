package com.rendyezaputra.hris.hriswebresources.cqrs.exception;

public class AggregateNotFoundException extends RuntimeException {
    public AggregateNotFoundException(String message) {
        super(message);
    }
}
