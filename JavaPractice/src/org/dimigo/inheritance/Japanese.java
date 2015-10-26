package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Japanese extends Person {
    @Override
    public void sayHello() {
        System.out.println("あんねい");
    }

    @Override
    public void sayBye() {
        System.out.println("バイバイ");
    }
}
