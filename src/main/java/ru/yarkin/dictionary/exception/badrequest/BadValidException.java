package ru.yarkin.dictionary.exception.badrequest;

import ru.yarkin.dictionary.exception.base.BadRequestException;

public class BadValidException extends BadRequestException {
    public BadValidException(String paramTitle) {
        super(paramTitle + "Bad valid");
    }
}
