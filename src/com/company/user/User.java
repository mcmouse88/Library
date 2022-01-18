package com.company.user;

import com.company.Book;
import com.company.impl.Administrator;
import com.company.impl.Reader;

public abstract class User implements Reader {
    protected String name;
    protected String role;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void askedBook(Book book, Administrator administrator) {
        System.out.format("Читатель %s попросил у %s книгу \"%s\"%n", name, administrator, book);
    }

    @Override
    public void getBook(Book book) {
        System.out.format("читатель %s получил книгу \"%s\"%n", name, book);
    }

    @Override
    public void readBook(Book book) {
        System.out.format("Читатель %s прочитал книгу \"%s\"%n", name, book);
    }

    @Override
    public void returnBook(Book book) {
        System.out.format("читатель %s вернул книгу \"%s\"%n", name, book);
    }

    public String toString() {
        return role + " " + name;
    }
}
