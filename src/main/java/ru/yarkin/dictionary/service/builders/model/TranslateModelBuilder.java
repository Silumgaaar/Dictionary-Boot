package ru.yarkin.dictionary.service.builders.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ru.yarkin.dictionary.db.entity.TranslateEntity;
import ru.yarkin.dictionary.model.dto.TranslateDto;

@Service
@RequiredArgsConstructor
public class TranslateModelBuilder implements ModelBuilder<TranslateDto, TranslateEntity>{

    private final WordModelBuilder wordModelBuilder;

    @Override
    public TranslateDto buildModel(TranslateEntity entity) {

        return TranslateDto.builder()
                .id(entity.getId())
                .sourceWord(wordModelBuilder.buildModel(entity.getSourceWord()))
                .targetWord(wordModelBuilder.buildModel(entity.getTargetWord()))
                .build();
    }
}
