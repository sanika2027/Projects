package com.javaproject.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBooks(Book book){
        books.add(book);
    }

    public void registerMembers(Member member){
        members.add(member);
    }

    public Book findBook(String isbn){
        for (Book book : books){
            if (book.getItemId().equals(isbn)){
                return book;
            }
        }
        return null;
    }

   public Member findMember(String memberId){
        for (Member member : members){
            if (member.getId().equals(memberId)){
                return member;
            }
        }
        return null;
   }

    public void issueBook(String isbn, String memberId) {
        Book book = findBook(isbn);
        Member member = findMember(memberId);
        if (book != null && member != null) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                member.borrowBooks(book);
                System.out.println("Book issued successfully to " + member.getName());
            } else {
                System.out.println("Book is not available.");
            }
        } else {
            System.out.println("Book issue failed. Either book or member not found.");
        }
    }

    public void returnBook(String isbn, String memberId) {
        Book book = findBook(isbn);
        Member member = findMember(memberId);
        if (book != null && member != null) {
            if (!book.isAvailable() && member.getBorrowedBooks().contains(book)) {
                book.setAvailable(true);
                member.returnBook(book);
                System.out.println("Book returned successfully from " + member.getName());
            } else {
                System.out.println("Book return failed. Either book is already available or not borrowed by this member.");
            }
        } else {
            System.out.println("Book return failed. Either book or member not found.");
        }
    }


    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Method to display all members in the library
    public void displayMembers() {
        System.out.println("Members in the library:");
        for (Member member : members) {
            System.out.println("ID: " + member.getId() + ", Name: " + member.getName());
        }
    }

}
