package com.company.impl;

public interface Reader {
    void askedBook(String Book, Administrator administrator);

    void getBook(String book);

    void returnBook(String book);
}
