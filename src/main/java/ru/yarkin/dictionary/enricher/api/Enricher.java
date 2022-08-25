package ru.yarkin.dictionary.enricher.api;

import ru.yarkin.dictionary.db.entity.BaseEntity;
import ru.yarkin.dictionary.exception.base.NotFoundException;

public interface Enricher<D, E extends BaseEntity> {

    E enrich(D d, E entity) throws NotFoundException;

}
