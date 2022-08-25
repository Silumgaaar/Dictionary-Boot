package ru.yarkin.dictionary.service.builders.model;

public interface ModelBuilder<M,E> {
    M buildModel(E entity);
}
