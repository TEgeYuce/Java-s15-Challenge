package com.lib_system.model;
import java.time.LocalDate;

public class Book {

    private String bookId;
    private String name;
    private String author;
    private String edition;
    private String status;
    private LocalDate dateOfPurchase;
    private double price;

    public Book(String bookId, String name, String author, String edition, double price) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.edition = edition;
        this.status = "available";
        this.dateOfPurchase = LocalDate.now();
        this.price = price;
    }

    public String getBookId() {
        return this.bookId;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getEdition() {
        return this.edition;
    }

    public String getStatus() {
        return this.status;
    }

    public LocalDate getDateOfPurchase() {
        return this.dateOfPurchase;
    }

    public double getPrice() {
        return this.price;
    }

    public String getAuthorName() {
        return this.author;
    }

    public String getTitle() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return "Library";
    }

    public void changeOwner(String newOwner) {
        System.out.println("Book ownership changed -> " + newOwner);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Book status updated -> " + newStatus);
    }

    public void display() {
        System.out.println("Book id: " + bookId + ", Title: " + name +
                ", Author: " + author + ", Status: " + status);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}

