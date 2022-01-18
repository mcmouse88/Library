package com.company.impl;

import com.company.Book;

public interface Reader {
    void askedBook(Book book, Administrator administrator);

    void getBook(Book book);

    void returnBook(Book book);
}
