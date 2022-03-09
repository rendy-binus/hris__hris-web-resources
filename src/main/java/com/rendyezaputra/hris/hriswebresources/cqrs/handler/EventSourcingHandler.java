package com.rendyezaputra.hris.hriswebresources.cqrs.handler;

import com.rendyezaputra.hris.hriswebresources.cqrs.domain.AggregateRoot;
import com.rendyezaputra.hris.hriswebresources.cqrs.exception.AggregateNotFoundException;
import com.rendyezaputra.hris.hriswebresources.cqrs.exception.ConcurrencyException;

import java.util.UUID;

public interface EventSourcingHandler<T> {
    void save(AggregateRoot aggregate) throws ConcurrencyException;
    T getById(UUID id) throws AggregateNotFoundException;
}
