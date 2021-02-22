package com.ansari.controller;

import com.ansari.model.Word;
import com.ansari.service.SearchWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SearchWordsController {

    @Autowired
    private SearchWordsService searchWordsService;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/words")
    public ModelAndView viewWords(@RequestParam(value = "word")String wordToBeSearched) {
        List<Word> words = searchWordsService.findAll(wordToBeSearched);

        Map<String, Object> params = new HashMap<>();
        params.put("words", words);

        return new ModelAndView("words", params);
    }

}
