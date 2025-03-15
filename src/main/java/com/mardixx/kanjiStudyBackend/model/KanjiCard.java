package com.mardixx.kanjiStudyBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
//Defining what a "KanjiCard" should have
public class KanjiCard {

    @Id
    @GeneratedValue
    private Long Id;

    @NonNull
    private String Kana;

    @NonNull
    private Character Kanji;

    @NonNull
    private String Translation;

    @NonNull
    private String UseCase;
}
