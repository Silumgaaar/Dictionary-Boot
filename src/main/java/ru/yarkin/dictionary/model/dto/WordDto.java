package ru.yarkin.dictionary.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.yarkin.dictionary.model.dto.LanguageDto;

@Data
@Builder
@AllArgsConstructor
public class WordDto {
    private Long id;
    private String value;
    private LanguageDto languageDto;  //todo поправить языки
}
