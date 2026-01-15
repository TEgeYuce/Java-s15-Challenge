package com.lib_system.model;
import java.util.List;
import java.util.ArrayList;

public class Reader extends Person {

    private MemberRecord memberRecord;
    private List<Book> books;

    public Reader(String name, MemberRecord memberRecord) {
        super(name);
        this.memberRecord = memberRecord;
        this.books = new ArrayList<>();
    }

    public MemberRecord getMemberRecord() { return this.memberRecord; }

    public List<Book> getBooks() { return this.books; }

    public void purchaseBook(Book book) {
        System.out.println(super.getName() + " book is purchased -> " + book.getName());
    }

    public void borrowBook(Book book) {

        if (memberRecord.getNoBooksIssued() < memberRecord.getMaxBookLimit() &&
                book.getStatus().equals("available")) {
            books.add(book);
            book.setStatus("issued");
            memberRecord.incBookIssued();
            System.out.println(super.getName() + " book is borrowed -> " + book.getName());
        } else {
            System.out.println("Can't borrow the book. The limit exceeded or this book unavailable.");
        }

    }

    public void returnBook(Book book) {

        if (books.remove(book)) {
            book.setStatus("available");
            memberRecord.decBookIssued();
            System.out.println(super.getName() + " book is returned -> " + book.getName());
        }
    }

    public void showBook() {
        System.out.println("Books were borrowed by " + super.getName() + " ->");

        for (Book book : books) {
            book.display();
        }
    }

    @Override
    public String whoYouAre() {
        return "I am a Reader -> " + super.getName();
    }


}

