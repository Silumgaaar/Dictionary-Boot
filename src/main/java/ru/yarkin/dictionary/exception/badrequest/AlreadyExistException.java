package ru.yarkin.dictionary.exception.badrequest;

import ru.yarkin.dictionary.exception.base.BadRequestException;

public class AlreadyExistException extends BadRequestException {
    public AlreadyExistException(String paramKey, String paramValue) {
        super(paramKey + " = " + paramValue+ " is already in used!" );
    }
}
