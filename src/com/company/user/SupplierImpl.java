package com.company.user;

import com.company.impl.Reader;
import com.company.impl.Supplier;

public class SupplierImpl extends User implements Supplier {
    public Object object;

    public SupplierImpl(String name) {
        super(name);
        role = "поставщик";
    }

    @Override
    public void deliveryBook(String book) {
        System.out.format("%s %s принес книгу \"%s\" в библиотеку%n", role, name, book);
    }
}
