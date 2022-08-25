package ru.yarkin.dictionary.enricher;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.yarkin.dictionary.db.entity.WordEntity;
import ru.yarkin.dictionary.enricher.api.Enricher;
import ru.yarkin.dictionary.exception.base.NotFoundException;
import ru.yarkin.dictionary.model.request.UpdateWordDto;
import ru.yarkin.dictionary.service.LanguageModelService;

@Component
@RequiredArgsConstructor
public class WordEnricher implements Enricher<UpdateWordDto, WordEntity> {

    private final LanguageModelService languageModelService;

    @Override
    public WordEntity enrich(UpdateWordDto wordDto, WordEntity entity) throws NotFoundException {
        entity.setLanguage(languageModelService.getLanguageEntityById(wordDto.getIdLanguage()));
        return entity;
    }
}
