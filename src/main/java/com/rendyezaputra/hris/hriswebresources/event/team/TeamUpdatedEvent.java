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
public class TeamUpdatedEvent extends BaseEvent {
    private String name;
    private String color;
    private String updatedBy;
    private LocalDateTime updatedDate;

    @Builder
    public TeamUpdatedEvent(UUID id, int version, String name, String color, String updatedBy, LocalDateTime updatedDate) {
        super(id, version);
        this.name = name;
        this.color = color;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }
}
