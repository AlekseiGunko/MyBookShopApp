package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PopularController {

    @GetMapping("/books/popular")
    public String popularPage() {

        return "books/popular";
    }
}
