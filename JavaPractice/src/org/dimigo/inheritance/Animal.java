package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
