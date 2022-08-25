package ru.yarkin.dictionary.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "TranslateEntity")
@Table(name = "translate", schema = "y_cfg")
@Getter
@Setter
public class TranslateEntity extends BaseIdentityEntity {

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "source_word_id")
    private WordEntity sourceWord;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "target_word_id")
    private WordEntity targetWord;
}
