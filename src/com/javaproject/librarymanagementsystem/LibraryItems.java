package com.javaproject.librarymanagementsystem;

public interface LibraryItems {
    String getItemId();
    String getTitle();
    boolean isAvailable();
    void setAvailable(boolean available);
}
