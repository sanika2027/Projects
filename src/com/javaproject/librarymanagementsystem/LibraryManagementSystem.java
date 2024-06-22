package com.javaproject.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding some books
        Book book1 = new Book("1234", "Effective Java", "Joshua Bloch");
        Book book2 = new Book("5678", "Clean Code", "Robert C. Martin");

        library.addBooks(book1);
        library.addBooks(book2);

        // Registering members
        Member member1 = new Member("M001", "Alice");
        Member member2 = new Member("M002", "Bob");

        library.registerMembers(member1);
        library.registerMembers(member2);

        // Displaying initial books
        System.out.println("Initial books in the library:");
        library.displayBooks();

        // Displaying initial members
        System.out.println("\nInitial members in the library:");
        library.displayMembers();

        // Issuing and returning books
        System.out.println("\nIssuing book 'Effective Java' to member 'Alice':");
        library.issueBook("1234", "M001");  // Corrected ID

        System.out.println("\nAttempting to issue the same book 'Effective Java' to member 'Bob':");
        library.issueBook("1234", "M002");

        System.out.println("\nReturning book 'Effective Java' from member 'Alice':");
        library.returnBook("1234", "M001");  // Corrected ID

        System.out.println("\nAttempting to return a book 'Clean Code' that was not borrowed by 'Alice':");
        library.returnBook("5678", "M001");

        // Displaying final books
        System.out.println("\nFinal books in the library:");
        library.displayBooks();

        // Displaying final members
        System.out.println("\nFinal members in the library:");
        library.displayMembers();
    }
}
