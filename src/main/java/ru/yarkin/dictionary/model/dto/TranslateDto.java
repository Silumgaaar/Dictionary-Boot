package ru.yarkin.dictionary.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TranslateDto {
    private Long id;
    private WordDto sourceWord;
    private WordDto targetWord; //todo подумать над изменением дто(мб отправлять только значения?)
}
