package ru.yarkin.dictionary.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yarkin.dictionary.exception.badrequest.AlreadyExistException;
import ru.yarkin.dictionary.exception.badrequest.BadValidException;
import ru.yarkin.dictionary.exception.base.NotFoundException;
import ru.yarkin.dictionary.model.dto.TranslateDto;
import ru.yarkin.dictionary.model.request.UpdateTranslateDto;
import ru.yarkin.dictionary.service.TranslateModelService;

@Slf4j
@RestController
@RequestMapping("/translate")
@RequiredArgsConstructor
public class TranslateModelController {
    private final TranslateModelService translateModelService;

    @PostMapping("")
    public TranslateDto save(@RequestBody UpdateTranslateDto updateTranslateDto) throws BadValidException, NotFoundException, AlreadyExistException {
        return translateModelService.save(updateTranslateDto);
    }

    //todo метод удаления
    //todo метод показа всех пар словаря
}
