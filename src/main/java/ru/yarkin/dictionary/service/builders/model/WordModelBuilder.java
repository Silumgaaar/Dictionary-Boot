package ru.yarkin.dictionary.service.builders.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yarkin.dictionary.db.entity.WordEntity;
import ru.yarkin.dictionary.model.dto.WordDto;

@Service
@RequiredArgsConstructor
public class WordModelBuilder implements ModelBuilder<WordDto, WordEntity> {

    private final LanguageModelBuilder languageModelBuilder;

    @Override
    public WordDto buildModel(WordEntity entity) {
        return WordDto.builder()
                .id(entity.getId())
                .value(entity.getValue())
                .languageDto(languageModelBuilder.buildModel(entity.getLanguage()))
                .build();
    }
}
