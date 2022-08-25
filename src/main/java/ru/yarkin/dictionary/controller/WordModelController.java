package ru.yarkin.dictionary.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.yarkin.dictionary.exception.base.NotFoundException;
import ru.yarkin.dictionary.model.dto.WordDto;
import ru.yarkin.dictionary.service.WordModelService;

@Slf4j
@RestController
@RequestMapping("/word")
@RequiredArgsConstructor
public class WordModelController {
    private final WordModelService wordModelService;

    @GetMapping("/id/{id}")
    public WordDto getLanguageById(@PathVariable Long id) throws NotFoundException {
        return wordModelService.getWordById(id);
    }
}
