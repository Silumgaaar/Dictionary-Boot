package ru.yarkin.dictionary.exception.base;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends Exception {
    public NotFoundException(String title ,Long id){
        super(title + " not found by id = " + id);
    }
}
