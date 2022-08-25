package ru.yarkin.dictionary.model.request;

import lombok.Data;

@Data
public class UpdateTranslateDto {
    private UpdateWordDto sourceWord;
    private UpdateWordDto targetWord;
}
