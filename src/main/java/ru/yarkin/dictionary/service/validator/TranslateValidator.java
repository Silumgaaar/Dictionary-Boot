package ru.yarkin.dictionary.service.validator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yarkin.dictionary.exception.notfound.LanguageNotFoundException;
import ru.yarkin.dictionary.model.request.UpdateTranslateDto;
import ru.yarkin.dictionary.service.LanguageModelService;

import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class TranslateValidator {
    private final LanguageModelService service;

    public boolean validateTranslate(UpdateTranslateDto translate) throws LanguageNotFoundException {
        Pattern patternKey = Pattern.compile(service.getLanguageById(translate.getSourceWord().getIdLanguage()).getRule());
        Pattern patternValue = Pattern.compile(service.getLanguageById(translate.getTargetWord().getIdLanguage()).getRule());

        boolean isValidKey = patternKey.matcher(translate.getSourceWord().getValue()).matches();
        boolean isValidValue = patternValue.matcher(translate.getTargetWord().getValue()).matches();

        return isValidKey && isValidValue;
    }
}
