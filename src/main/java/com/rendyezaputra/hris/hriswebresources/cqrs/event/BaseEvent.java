package com.rendyezaputra.hris.hriswebresources.cqrs.event;

import com.rendyezaputra.hris.hriswebresources.cqrs.message.Message;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public abstract class BaseEvent extends Message {
    private int version;

    public BaseEvent(UUID id, int version) {
        super(id);
        this.version = version;
    }
}
