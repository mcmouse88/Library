package com.company.impl;

import com.company.user.User;

public interface Administrator {

    default void overdueNotification(Reader reader, String book, User user) {
        System.out.format("%s %s позвонил читателю %s и напомнил о возврате книги \"%s\"%n", user.getRole(), user.getName(), reader, book);
    }

    default void findBook(String book, User user) {
        System.out.format("%s %s нашел книгу \"%s\"%n", user.getRole(), user.getName(), book);
    }

    default void giveBook(String book, Reader reader, User user) {
        System.out.format("%s %s выдал книгу \"%s\" читателю %s%n", user.getRole(), user.getName(), book, reader);
    }
}
