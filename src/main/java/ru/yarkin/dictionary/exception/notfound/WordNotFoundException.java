package ru.yarkin.dictionary.exception.notfound;

import ru.yarkin.dictionary.exception.base.NotFoundException;

public class WordNotFoundException extends NotFoundException {
    public WordNotFoundException(Long id){super("Word", id);}
}

