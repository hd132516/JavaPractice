package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Korean extends Person {
    @Override
    public void sayHello() {
        System.out.println("안녕");
    }

    @Override
    public void sayBye() {
        System.out.println("잘가");
    }
}
