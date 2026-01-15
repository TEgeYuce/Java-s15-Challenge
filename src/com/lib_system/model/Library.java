package com.lib_system.model;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Library {

    private Map<String, MemberRecord> memberRecords;
    private List<Librarian> librarians;
    private List<Reader> readers;
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
        this.memberRecords = new HashMap<>();
        this.librarians = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to library -> " + book.getName());
    }

    public Book newBook(String bookId, String name, String author, String edition, double price) {
        Book book = new Book(bookId, name, author, edition, price);
        addBook(book);
        return book;
    }

    public Book getBook(String bookId) {
        return books.stream()
                .filter(book -> book.getBookId().equals(bookId))
                .findFirst()
                .orElse(null);
    }

    public Reader getReader(String memberId) {
        return readers.stream()
                .filter(reader -> reader.getMemberRecord().getMemberId().equals(memberId))
                .findFirst()
                .orElse(null);
    }

    public void takeBackBook(String bookId, String memberId) {
        Book book = getBook(bookId);
        Reader reader = getReader(memberId);
        if (book != null && reader != null) {
            reader.returnBook(book);
        }
    }

    public void lendBook(String bookId, String memberId) {
        Book book = getBook(bookId);
        Reader reader = getReader(memberId);
        if (book != null && reader != null) {
            reader.borrowBook(book);
        }
    }

    public void showBook() {
        System.out.println("\n*** Library Books ***");

        for (Book book : books) {
            book.display();
        }
    }

    public Book searchBook(String criteria) {
        return books.stream()
                .filter(book -> book.getBookId().equals(criteria) ||
                        book.getName().toLowerCase().contains(criteria.toLowerCase()) ||
                        book.getAuthor().toLowerCase().contains(criteria.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
        memberRecords.put(reader.getMemberRecord().getMemberId(), reader.getMemberRecord());
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    public MemberRecord getMemberRecord(String memberId) {
        return memberRecords.get(memberId);
    }

    public List<Reader> getReaders() {
        return this.readers;
    }

    public List<Book> getBooks() {
        return this.books;
    }


}

