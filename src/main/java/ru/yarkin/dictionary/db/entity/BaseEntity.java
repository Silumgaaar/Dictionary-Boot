package ru.yarkin.dictionary.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @PrePersist
    public void prePersist() {
        this.setCreatedOn(LocalDateTime.now());
        this.setUpdatedOn(LocalDateTime.now());
    }

    @PreUpdate
    public void preUpdate() {
        this.setUpdatedOn(LocalDateTime.now());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass().getName());
    }
}
