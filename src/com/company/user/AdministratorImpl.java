package com.company.user;

import com.company.impl.Administrator;

public class AdministratorImpl extends User implements Administrator {

    public AdministratorImpl(String name) {
        super(name);
        role = "администратор";
    }
}
