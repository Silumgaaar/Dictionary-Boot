package ru.yarkin.dictionary.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class LanguageDto {
    private Long id;
    private String value;
    private String rule; //todo убрать правила
}
