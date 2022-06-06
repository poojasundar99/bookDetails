package com.example.bookdetails.dto;

import java.util.Map;

public class BookDto
{
    private Map<String,Integer> totalPrice;

    private int uniqueAuthors;

    private Map<String,Integer> highestPriceOfBook;


    public Map<String,Integer> getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Map<String,Integer> totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getUniqueAuthors() {
        return uniqueAuthors;
    }

    public void setUniqueAuthors(int uniqueAuthors) {
        this.uniqueAuthors = uniqueAuthors;
    }

    public Map<String,Integer> getHighestPriceOfBook() {
        return highestPriceOfBook;
    }

    public void setHighestPriceOfBook(Map<String,Integer> highestPriceOfBook) {
        this.highestPriceOfBook = highestPriceOfBook;
    }
}
