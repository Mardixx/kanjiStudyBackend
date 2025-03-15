package com.mardixx.kanjiStudyBackend.repository;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KanjiCardRepository extends JpaRepository<Long, Id> {
}
