package com.rendyezaputra.hris.hriswebresources.event.team;

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
public class TeamCreatedEvent extends BaseEvent {
    private String name;
    private String color;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
    private boolean active;
    private boolean deleted;

    @Builder
    public TeamCreatedEvent(UUID id, int version, String name, String color, String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate, boolean active, boolean deleted) {
        super(id, version);
        this.name = name;
        this.color = color;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.active = active;
        this.deleted = deleted;
    }
}
