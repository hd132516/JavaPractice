package org.dimigo.thread;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Race {
    public static void main(String[] args) {
        System.out.println("main thread start");

        Thread runner1 = new Runner("김병학");
        Thread runner2 = new Runner("우사인 볼트");

        runner1.start();
        runner2.start();

        System.out.println("main thread end");
    }
}
