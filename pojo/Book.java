package com.example.bookdetails.pojo;

public class Book {

    private String nameOfTheBook;

    private String author;

    private int priceOfBook;

    private int quantity;


    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPriceOfBook() {
        return priceOfBook;
    }

    public void setPriceOfBook(int priceOfBook) {
        this.priceOfBook = priceOfBook;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book(String nameOfTheBook, String  author, int priceOfBook, int quantity) {
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.priceOfBook = priceOfBook;
        this.quantity = quantity;
    }
}
