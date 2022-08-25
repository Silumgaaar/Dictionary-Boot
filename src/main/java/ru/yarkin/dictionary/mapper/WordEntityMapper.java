package ru.yarkin.dictionary.mapper;

import org.springframework.stereotype.Component;
import ru.yarkin.dictionary.db.entity.WordEntity;
import ru.yarkin.dictionary.model.request.UpdateWordDto;

@Component
public class WordEntityMapper {
    public WordEntity toEntity(UpdateWordDto wordDto, WordEntity entity){
        entity.setValue(wordDto.getValue());
        return entity;
    }
}
