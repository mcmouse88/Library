package com.company;

import com.company.impl.Reader;
import com.company.impl.Supplier;
import com.company.user.AdministratorImpl;
import com.company.user.LibrarianImpl;
import com.company.user.ReaderImpl;
import com.company.user.SupplierImpl;

public class Main {

    public static void main(String[] args) {
        ReaderImpl johnReader = new ReaderImpl("Джон");
        LibrarianImpl jamesLibrarian = new LibrarianImpl("Джеймс");
        SupplierImpl mustafaSupplier = new SupplierImpl("Мустафа");
        AdministratorImpl winstonAdministrator = new AdministratorImpl("Уинстон");

        jamesLibrarian.toOrderBook(mustafaSupplier, "Вино из одуванчиков");
        mustafaSupplier.deliveryBook("Вино из одуванчиков");

        johnReader.askedBook("Дракула", winstonAdministrator);
        winstonAdministrator.findBook("Дракула", winstonAdministrator);
        winstonAdministrator.giveBook("Дракула", johnReader, winstonAdministrator);
        johnReader.getBook("Дракула");
        winstonAdministrator.overdueNotification(johnReader, "Дракула", winstonAdministrator);
        johnReader.returnBook("Дракула");

        mustafaSupplier.askedBook("Дюна", jamesLibrarian);
        jamesLibrarian.findBook("Дюна", jamesLibrarian);
        jamesLibrarian.giveBook("Дюна", mustafaSupplier, jamesLibrarian);
        mustafaSupplier.getBook("Дюна");
        jamesLibrarian.overdueNotification(mustafaSupplier, "Дюна", jamesLibrarian);
        mustafaSupplier.returnBook("Дюна");
    }
}
