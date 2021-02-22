package com.ansari.service;

import com.ansari.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchWordsServiceImpl implements SearchWordsService{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Word> findAll(String word) {
        String sql = "SELECT * FROM words where word like ?;";
        return jdbcTemplate.query(sql, new Object[]{word+"%"}, new BeanPropertyRowMapper<>(Word.class));
    }
}
