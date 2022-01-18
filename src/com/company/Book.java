package com.company;

public record Book(String name) {

    @Override
    public String toString() {
        return this.name;
    }
}
