package com.mardixx.kanjiStudyBackend.model;

import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class KanjiCard {

    @Id
    @Generated
    public Long Id;

    @NonNull
    public String Kana;

    @NonNull
    public Character Kanji;

    @NonNull
    public String Translation;

    @NonNull
    public String UseCase;
}
