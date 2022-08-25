package ru.yarkin.dictionary.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yarkin.dictionary.db.entity.WordEntity;

@Repository
public interface WordEntityRepository extends JpaRepository<WordEntity, Long> {
}
