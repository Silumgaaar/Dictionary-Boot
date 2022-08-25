package ru.yarkin.dictionary.model.request;

import lombok.Data;

@Data
public class UpdateLanguageDto {
    private String value;
    private String rule; //todo нужны ли здесь правила?
}
