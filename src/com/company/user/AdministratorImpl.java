package com.company.user;

import com.company.impl.Administrator;
import com.company.impl.Reader;

public class AdministratorImpl extends User implements Administrator {

    public AdministratorImpl(String name) {
        super(name);
        role = "администратор";
    }
}
