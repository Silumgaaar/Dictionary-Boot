package ru.yarkin.dictionary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yarkin.dictionary.db.entity.LanguageEntity;
import ru.yarkin.dictionary.db.repo.LanguageEntityRepository;
import ru.yarkin.dictionary.exception.notfound.LanguageNotFoundException;
import ru.yarkin.dictionary.model.dto.LanguageDto;
import ru.yarkin.dictionary.service.builders.model.LanguageModelBuilder;

@Service
@RequiredArgsConstructor
public class LanguageModelService {
    private final LanguageEntityRepository repository;
    private final LanguageModelBuilder builder;

    @Transactional(readOnly = true)
    public LanguageDto getLanguageById(Long languageId) throws LanguageNotFoundException {
        return repository.findById(languageId)
                .map(builder::buildModel)
                .orElseThrow(() -> new LanguageNotFoundException(languageId));
    }

    @Transactional(readOnly = true)
    public LanguageEntity getLanguageEntityById(Long languageId) throws LanguageNotFoundException{
        return repository.findById(languageId).orElseThrow(() -> new LanguageNotFoundException(languageId));
    }
}
