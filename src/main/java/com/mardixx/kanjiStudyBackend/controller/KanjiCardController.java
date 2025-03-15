package com.mardixx.kanjiStudyBackend.controller;

import com.mardixx.kanjiStudyBackend.model.KanjiCard;
import com.mardixx.kanjiStudyBackend.service.KanjiCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
//Creating a controller and adding methods to it to interact with the backend
public class KanjiCardController {
    @Autowired
    public KanjiCardService kanjiCardService;

    @PostMapping
    public KanjiCard save(@RequestBody KanjiCard kanjiCard) {
        return kanjiCardService.save(kanjiCard);
    }

    @GetMapping
    public List<KanjiCard> findAllKanjiCards() {
        return kanjiCardService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<KanjiCard> getCardById(@PathVariable("id") Long id) {
        return kanjiCardService.findById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKanjiCardById(@PathVariable("id") Long id) {
        kanjiCardService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
