package com.rendyezaputra.hris.hriswebresources.event;

import com.rendyezaputra.hris.hriswebresources.cqrs.event.BaseEvent;

public interface EventProducer {
    void produce(String topic, String key, BaseEvent event);
}
