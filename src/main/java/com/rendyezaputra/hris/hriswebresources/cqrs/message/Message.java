package com.rendyezaputra.hris.hriswebresources.cqrs.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Message {
    private UUID id;
}
