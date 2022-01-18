package com.company.impl;

import com.company.Book;
import com.company.user.User;

public interface Administrator {

    default void overdueNotification(Reader reader, Book book, User user) {
        System.out.format("Администратор %s позвонил читателю %s и напомнил о возврате книги \"%s\"%n", user.getName(), reader.getName(), book);
    }

    default void findBook(Book book, User user) {
        System.out.format("Администратор %s нашел книгу \"%s\"%n", user.getName(), book);
    }

    default void giveBook(Book book, Reader reader, User user) {
        System.out.format("Администратор %s выдал книгу \"%s\" читателю %s%n", user.getName(), book, reader);
    }
}
