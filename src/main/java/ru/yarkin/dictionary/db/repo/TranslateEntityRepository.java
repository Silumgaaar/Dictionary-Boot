package ru.yarkin.dictionary.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yarkin.dictionary.db.entity.TranslateEntity;

import java.util.Optional;

public interface TranslateEntityRepository extends JpaRepository<TranslateEntity, Long> {
    Optional<TranslateEntity> findTranslateEntityBySourceWord_ValueAndTargetWord_Value(String sourceWord, String targetWord);
}
