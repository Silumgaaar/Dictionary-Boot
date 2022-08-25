package ru.yarkin.dictionary.model.request;

import lombok.Data;

@Data
public class UpdateWordDto {
    private String value;
    private Long idLanguage;
}
