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
public class TeamDeletedEvent extends BaseEvent {
    private String updatedBy;
    private LocalDateTime updatedDate;
    private boolean active;
    private boolean deleted;

    @Builder
    public TeamDeletedEvent(UUID id, int version, String updatedBy, LocalDateTime updatedDate, boolean active, boolean deleted) {
        super(id, version);
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.active = active;
        this.deleted = deleted;
    }
}
