package com.rendyezaputra.hris.hriswebresources.cqrs.document;

import com.rendyezaputra.hris.hriswebresources.cqrs.event.BaseEvent;
import com.rendyezaputra.hris.hriswebresources.cqrs.exception.AggregateNotFoundException;
import com.rendyezaputra.hris.hriswebresources.cqrs.exception.ConcurrencyException;

import java.util.List;
import java.util.UUID;

public interface EventStore {
    void saveEvents(UUID aggregateId, Iterable<BaseEvent> events, int expectedVersion) throws ConcurrencyException;
    List<BaseEvent> getEvents(UUID aggregateId) throws AggregateNotFoundException;
}
