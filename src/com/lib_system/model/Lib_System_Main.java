package com.lib_system.model;

public class Lib_System_Main {

    public static void main(String[] args) {

        Library library = new Library();

        Librarian librarian = new Librarian("TEgeYuce", "tege1234");
        library.addLibrarian(librarian);

        Book book1 = new Book("B01", "Pro Java Programming", "Brett Spell", "2nd Edition", 19.99);
        Book book2 = new StudyBooks("B02", "The Road to React", "Robin Wieruch", "2021 Edition", 29.99);
        Book book3 = new Magazines("B03", "Eloquent JavaScript", "Marijn Haverbeke", "4th Edition", 24.99);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        MemberRecord studentRecord = new MemberRecord("S01", "student", "Student1",
                "2345 College Ave", "555-2345");
        MemberRecord facultyRecord = new MemberRecord("F01", "faculty", "Science",
                "4567 Faculty Rd", "555-4567");

        Student student = new Student("Student1", studentRecord, "S01");
        Faculty faculty = new Faculty("Science", facultyRecord, "F01");
        library.addReader(student);
        library.addReader(faculty);

        Author author = new Author("Brett Spell");
        author.addBook(book1);

        System.out.println("----- Demo of Library System -----\n");
        library.showBook();

        System.out.println("\n----- Identity is checking -----");
        System.out.println(student.whoYouAre());
        System.out.println(faculty.whoYouAre());
        System.out.println(librarian.whoYouAre());
        System.out.println(author.whoYouAre());

        System.out.println("\n----- Book is borrowing -----");
        librarian.issueBook("B01", "S01", library);
        librarian.issueBook("B02", "F01", library);

        System.out.println("\n----- Student's Books -----");
        student.showBook();

        System.out.println("\n----- Faculty's Books -----");
        faculty.showBook();

        System.out.println("\n----- Book Search -----");
        Book foundBook = librarian.searchBook("Clean Code", library);
        if (foundBook != null) {
            System.out.println("Book was found -> " + foundBook);
        }

        System.out.println("\n----- Returned Book -----");
        librarian.returnBook("B01", "S01", library);

        System.out.println("\n----- Updated Library Status -----");
        library.showBook();

        System.out.println("\n----- Payment is processing -----");
        studentRecord.payBill(44.98);


        System.out.println("\n----- Demo of Library System is completed !!! -----");


    }


}

