package com.company.user;

import com.company.Book;
import com.company.impl.Supplier;

public class SupplierImpl extends User implements Supplier {

    public SupplierImpl(String name) {
        super(name);
        role = "поставщик";
    }

    @Override
    public void deliveryBook(Book book) {
        System.out.format("%s %s принес книгу \"%s\" в библиотеку%n", role, name, book);
    }
}
