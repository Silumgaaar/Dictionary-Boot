package ru.yarkin.dictionary.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "LanguageEntity")
@Table(name = "languages", schema = "y_cfg")
@Getter
@Setter
public class LanguageEntity extends BaseIdentityEntity {

    @Column(name = "value")
    private String value;

    @Column(name = "rule")
    private String rule;
}
