package com.example.bookdetails.controller;

import com.example.bookdetails.dto.BookDto;
import com.example.bookdetails.pojo.Book;
import com.example.bookdetails.service.BookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookAuthorController {

    @Autowired
    BookAuthorService bookAuthorService;

    @PostMapping(value = "/books", consumes = MediaType.APPLICATION_JSON_VALUE)
    public BookDto getBookDetails(@RequestBody List<Book> books){
        return bookAuthorService.bookService(books);
    }
}

