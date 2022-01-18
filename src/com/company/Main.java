package com.company;

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
        Book dracula = new Book("Дракула");
        Book dune = new Book("Дюна");
        Book dandelionWine = new Book("Вино из одуванчиков");

        jamesLibrarian.toOrderBook(mustafaSupplier, dandelionWine);
        mustafaSupplier.deliveryBook(dandelionWine);

        johnReader.askedBook(dracula, winstonAdministrator);
        winstonAdministrator.findBook(dracula, winstonAdministrator);
        winstonAdministrator.giveBook(dracula, johnReader, winstonAdministrator);
        johnReader.getBook(dracula);
        winstonAdministrator.overdueNotification(johnReader, dracula, winstonAdministrator);
        johnReader.readBook(dracula);
        johnReader.returnBook(dracula);

        mustafaSupplier.askedBook(dune, jamesLibrarian);
        jamesLibrarian.findBook(dune, jamesLibrarian);
        jamesLibrarian.giveBook(dune, mustafaSupplier, jamesLibrarian);
        mustafaSupplier.getBook(dune);
        jamesLibrarian.overdueNotification(mustafaSupplier, dune, jamesLibrarian);
        mustafaSupplier.readBook(dune);
        mustafaSupplier.returnBook(dune);
    }
}
