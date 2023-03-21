package com.example.MyBookShopApp.data;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Author> getAuthors() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM author", (ResultSet rs, int rowNum) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setBookId(rs.getInt("bookId"));
            author.setAuthorName(rs.getString("authorName"));
            return author;
        });

        return new ArrayList<>(authors);
    }
}