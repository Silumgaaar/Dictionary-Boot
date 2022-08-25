package ru.yarkin.dictionary.exception.notfound;

import ru.yarkin.dictionary.exception.base.NotFoundException;

public class LanguageNotFoundException extends NotFoundException {
    public LanguageNotFoundException(Long id){super("Language", id);}
}
