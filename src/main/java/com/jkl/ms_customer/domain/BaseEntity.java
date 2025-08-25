package com.jkl.ms_customer.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;
import java.util.Objects;


@MappedSuperclass
public class BaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime updatedat;

    private boolean isActive;


    @PrePersist
    public void preCreate() {
        this.createdAt = LocalDateTime.now();
        setActive(true);

    }


    @PreUpdate
    public void preUpdate() {
        this.updatedat = LocalDateTime.now();
        if (Objects.isNull(this.isActive)) {
            this.setActive(true);
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
