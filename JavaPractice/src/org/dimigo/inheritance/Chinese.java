package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Chinese extends Person {
    @Override
    public void sayHello() {
        System.out.println("你好。");
    }

    @Override
    public void sayBye() {
        System.out.println("再见!");
    }
}
