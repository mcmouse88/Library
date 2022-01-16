package com.company.user;

public class ReaderImpl extends User {
    public ReaderImpl(String name) {
        super(name);
        role = "читатель";
    }

    @Override
    public String toString() {
        return name;
    }
}
