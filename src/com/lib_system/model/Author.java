package com.lib_system.model;
import java.util.List;
import java.util.ArrayList;

public class Author {

    private List<Book> books;
    private String name;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() { return this.books; }
    public String getName() { return this.name; }

    public Book newBook(String bookId, String title, String edition, double price) {
        Book book = new Book(bookId, this.name, title, edition, price);
        books.add(book);
        return book;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String whoYouAre() {
        return "I am an author -> " + name;
    }


}

