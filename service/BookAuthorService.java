package com.example.bookdetails.service;

import com.example.bookdetails.dto.BookDto;
import com.example.bookdetails.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookAuthorService {


    public BookDto bookService(List<Book> books){
        Map<String,Integer> authorBooksPrice = new HashMap<>();
        books.forEach(book -> {
            if(authorBooksPrice.containsKey(book.getAuthor())){
                Integer currentValue = authorBooksPrice.get(book.getAuthor());
                authorBooksPrice.put(book.getAuthor(), currentValue + (book.getPriceOfBook() * book.getQuantity()));
            }else {
                authorBooksPrice.put(book.getAuthor(), book.getPriceOfBook() * book.getQuantity());
            }
        });
        Map<String,Integer> authorBooksHighestPrice = new HashMap<>();
        books.forEach(book -> {
            if (authorBooksHighestPrice.containsKey(book.getAuthor())){
                if(authorBooksHighestPrice.get(book.getAuthor())<book.getPriceOfBook()){
                    authorBooksHighestPrice.put(book.getAuthor(), book.getPriceOfBook());
                }
            }else {
                authorBooksHighestPrice.put(book.getAuthor(), book.getPriceOfBook());
            }

        });

        BookDto bookDto = new BookDto();
        bookDto.setHighestPriceOfBook(authorBooksHighestPrice);
        bookDto.setTotalPrice(authorBooksPrice);
        bookDto.setUniqueAuthors(authorBooksPrice.keySet().size());
        return bookDto;
    }

}

