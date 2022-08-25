package ru.yarkin.dictionary.service.builders.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yarkin.dictionary.db.entity.LanguageEntity;
import ru.yarkin.dictionary.model.dto.LanguageDto;

@Service
@RequiredArgsConstructor
public class LanguageModelBuilder implements ModelBuilder<LanguageDto, LanguageEntity>{
    @Override
    public LanguageDto buildModel(LanguageEntity entity) {
        return LanguageDto.builder()
                .id(entity.getId())
                .value(entity.getValue())
                .rule(entity.getRule())
                .build();
    }
}
