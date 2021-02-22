package com.ansari.model;

import java.util.Objects;
import java.util.StringJoiner;

public class Word {

    private String word;

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Word word = (Word) obj;
        return Objects.equals(word, word.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Word.class.getSimpleName() + "[", "]")
                .add("word='" + word + "'")
                .toString();
    }
}
