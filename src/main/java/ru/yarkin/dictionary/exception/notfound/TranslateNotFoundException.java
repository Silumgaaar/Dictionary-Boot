package ru.yarkin.dictionary.exception.notfound;

import ru.yarkin.dictionary.exception.base.NotFoundException;

public class TranslateNotFoundException extends NotFoundException {
    public TranslateNotFoundException(Long id) {
        super("Translate", id);
    }
}
