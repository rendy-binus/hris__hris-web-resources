package com.rendyezaputra.hris.hriswebresources.cqrs.command;

import com.rendyezaputra.hris.hriswebresources.cqrs.message.Message;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public abstract class BaseCommand extends Message {
    private String loginId;

    public BaseCommand(UUID id, String loginId) {
        super(id);
        this.loginId = loginId;
    }
}
