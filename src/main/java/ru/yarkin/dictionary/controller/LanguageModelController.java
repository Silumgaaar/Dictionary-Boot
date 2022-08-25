package ru.yarkin.dictionary.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yarkin.dictionary.exception.base.NotFoundException;
import ru.yarkin.dictionary.model.dto.LanguageDto;
import ru.yarkin.dictionary.service.LanguageModelService;

@Slf4j
@RestController
@RequestMapping("/language")
@RequiredArgsConstructor
public class LanguageModelController {
    private final LanguageModelService languageModelService;

    @GetMapping("/id/{id}")
    public LanguageDto getLanguageById(@PathVariable Long id) throws NotFoundException{
        return languageModelService.getLanguageById(id);
    }

    //todo метод показа всех словарей
}
