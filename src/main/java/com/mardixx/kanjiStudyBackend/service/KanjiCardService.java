package com.mardixx.kanjiStudyBackend.service;

import com.mardixx.kanjiStudyBackend.model.KanjiCard;
import com.mardixx.kanjiStudyBackend.repository.KanjiCardRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KanjiCardService {

    private KanjiCardRepository kanjiCardRepository;

    @Autowired
    public KanjiCardService(KanjiCardRepository kanjiCardRepository) {this.kanjiCardRepository = kanjiCardRepository;}

    public List<KanjiCard> findAll() {
        return kanjiCardRepository.findAll();
    }

    public KanjiCard save(KanjiCard kanjiCard) {
        return kanjiCardRepository.save(kanjiCard);
    }

    public Optional<KanjiCard> findById(Long id) {
        return kanjiCardRepository.findById(id);
    }

    public void deleteById(Long id) {
        kanjiCardRepository.deleteById(id);
    }

    public void delete(KanjiCard kanjiCard) {
        kanjiCardRepository.delete(kanjiCard);
    }

    public void deleteAll(Iterable<KanjiCard> kanjiCards) {
        kanjiCardRepository.deleteAll(kanjiCards);
    }
}
