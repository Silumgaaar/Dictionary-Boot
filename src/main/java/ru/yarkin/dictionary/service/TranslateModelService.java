package ru.yarkin.dictionary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yarkin.dictionary.db.entity.TranslateEntity;
import ru.yarkin.dictionary.db.entity.WordEntity;
import ru.yarkin.dictionary.db.repo.TranslateEntityRepository;
import ru.yarkin.dictionary.enricher.WordEnricher;
import ru.yarkin.dictionary.exception.badrequest.AlreadyExistException;
import ru.yarkin.dictionary.exception.badrequest.BadValidException;
import ru.yarkin.dictionary.exception.base.NotFoundException;
import ru.yarkin.dictionary.mapper.WordEntityMapper;
import ru.yarkin.dictionary.model.dto.TranslateDto;
import ru.yarkin.dictionary.model.request.UpdateTranslateDto;
import ru.yarkin.dictionary.service.builders.model.TranslateModelBuilder;
import ru.yarkin.dictionary.service.validator.TranslateValidator;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TranslateModelService {
    private final TranslateEntityRepository repository;
    private final TranslateModelBuilder translateBuilder;
    private final TranslateValidator validator;
    private final WordEntityMapper wordMapper;
    private final WordEnricher wordEnricher;

    public TranslateDto save(UpdateTranslateDto translateDto) throws NotFoundException, BadValidException, AlreadyExistException {
        if(validator.validateTranslate(translateDto)){

            WordEntity sourceWord = wordEnricher.enrich(translateDto.getSourceWord() ,wordMapper.toEntity(translateDto.getSourceWord(),new WordEntity()));
            WordEntity targetWord = wordEnricher.enrich(translateDto.getTargetWord(),wordMapper.toEntity(translateDto.getTargetWord(), new WordEntity()));

            Optional<TranslateEntity> pair = repository.findTranslateEntityBySourceWord_ValueAndTargetWord_Value(sourceWord.getValue(), targetWord.getValue());
            if(pair.isPresent()) throw new AlreadyExistException("Pair", sourceWord.getValue() + targetWord.getValue()); //todo Доделать отправку сообщения

            //todo сделать проверку слов на повторение
            TranslateEntity translate = new TranslateEntity();
            translate.setSourceWord(sourceWord);
            translate.setTargetWord(targetWord);


            return translateBuilder.buildModel(repository.save(translate));
        } else throw new BadValidException("Incorrect Key or Value format"); //todo Валидация сделанна на коленке, доделать!
    }
}
