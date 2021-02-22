package com.ansari.service;

import com.ansari.model.Word;

import java.util.List;

public interface SearchWordsService {
    List<Word> findAll(String word);
}
