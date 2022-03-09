package com.rendyezaputra.hris.hriswebresources.cqrs.handler;

import com.rendyezaputra.hris.hriswebresources.cqrs.command.BaseCommand;

@FunctionalInterface
public interface CommandHandlerMethod <T extends BaseCommand> {
    void handle(T command);
}
