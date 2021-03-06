package com.company.user;

import com.company.Book;
import com.company.impl.Administrator;
import com.company.impl.Librarian;
import com.company.impl.Supplier;

public class LibrarianImpl extends User implements Librarian, Administrator {

    public LibrarianImpl(String name) {
        super(name);
        role = "библиотекарь";
    }

    @Override
    public void toOrderBook(Supplier supplier, Book book) {
        System.out.format("%s %s заказал у %s книгу \"%s\"%n", role, name, supplier, book);
    }
}
