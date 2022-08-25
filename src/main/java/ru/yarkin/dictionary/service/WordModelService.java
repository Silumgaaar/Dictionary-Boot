package ru.yarkin.dictionary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yarkin.dictionary.db.repo.WordEntityRepository;
import ru.yarkin.dictionary.exception.base.NotFoundException;
import ru.yarkin.dictionary.exception.notfound.WordNotFoundException;
import ru.yarkin.dictionary.model.dto.WordDto;
import ru.yarkin.dictionary.service.builders.model.WordModelBuilder;

@Service
@RequiredArgsConstructor
public class WordModelService {
    private final WordEntityRepository repository;
    private final WordModelBuilder builder;

    @Transactional(readOnly = true)
    public WordDto getWordById(Long wordId) throws NotFoundException {
        return repository.findById(wordId)
                .map(builder::buildModel)
                .orElseThrow(() -> new WordNotFoundException(wordId));
    }
}
