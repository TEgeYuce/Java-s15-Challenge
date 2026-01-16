package com.lib_system.model;

public class Librarian extends Person {

    private String password;

    public Librarian(String name, String password) {
        super(name);
        this.password = password;
    }

    public String getPassword() { return this.password; }

    public void setPassword(String password) { this.password = password; }

    public Book searchBook(String criteria, Library library) {
        return library.searchBook(criteria);
    }

    public void issueBook(String bookId, String memberId, Library library) {
        Book book = library.searchBook(bookId);
        MemberRecord member = library.getMemberRecord(memberId);
        Reader reader = library.getReader(memberId);
        if (book != null && member != null && reader != null) {
            reader.borrowBook(book);
        }
    }

    public boolean verifyMember(String memberId, Library library) {
        return library.getMemberRecord(memberId) != null;
    }

    public void createBill(String memberId, double amount) {
        System.out.println("Bill was created for member " + memberId + ": €" + amount);
    }

    public void calculateFine(String memberId) {
        System.out.println("Calculating the fine for member -> " + memberId);
    }

    public void returnBook(String bookId, String memberId, Library library) {
        Book book = library.searchBook(bookId);
        Reader reader = library.getReader(memberId);
        if (book != null && reader != null) {
            reader.returnBook(book);
        }
    }

    @Override
    public String whoYouAre() {
        return "I am a Librarian -> " + super.getName();
    }


}

