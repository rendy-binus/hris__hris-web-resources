package com.rendyezaputra.hris.hriswebresources.event.jobfunction;

import com.rendyezaputra.hris.hriswebresources.cqrs.event.BaseEvent;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class JobFunctionUpdatedEvent extends BaseEvent {
    private String name;
    private short level;
    private String color;
    private String updatedBy;
    private LocalDateTime updatedDate;

    @Builder
    public JobFunctionUpdatedEvent(UUID id, int version, String name, short level, String color, String updatedBy, LocalDateTime updatedDate) {
        super(id, version);
        this.name = name;
        this.level = level;
        this.color = color;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }
}
