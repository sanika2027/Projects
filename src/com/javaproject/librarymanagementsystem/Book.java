package com.javaproject.librarymanagementsystem;

public class Book implements LibraryItems{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book() {}

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    @Override
    public String getItemId() {
        return isbn;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
