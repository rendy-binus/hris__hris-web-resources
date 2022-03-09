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
public class JobFunctionCreatedEvent extends BaseEvent {
    private String name;
    private short level;
    private String color;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
    private boolean active;
    private boolean deleted;

    @Builder
    public JobFunctionCreatedEvent(UUID id, int version, String name, short level, String color, String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate, boolean active, boolean deleted) {
        super(id, version);
        this.name = name;
        this.level = level;
        this.color = color;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.active = active;
        this.deleted = deleted;
    }
}
