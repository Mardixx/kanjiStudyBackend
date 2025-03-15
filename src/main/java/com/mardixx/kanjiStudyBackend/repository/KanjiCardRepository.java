package com.mardixx.kanjiStudyBackend.repository;

import com.mardixx.kanjiStudyBackend.model.KanjiCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KanjiCardRepository extends JpaRepository<KanjiCard, Long> {
}
