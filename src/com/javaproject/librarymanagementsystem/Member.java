package com.javaproject.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person {

    private List<Book> borrowedBooks;

    public Member(String id, String name) {
        super(id, name);
        borrowedBooks = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "member";
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBooks(Book book){
        borrowedBooks.add(book);
    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
}
