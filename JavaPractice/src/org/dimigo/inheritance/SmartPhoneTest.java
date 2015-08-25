package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class SmartPhoneTest {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("iPhone 6", "애플", 700000);
        System.out.println(iPhone);
        iPhone.turnOn();
        iPhone.pay();
        iPhone.useSpecialFunction();
        iPhone.turnOff();

        Galaxy galaxy = new Galaxy("갤럭시 S6", "삼성", 650000);
        System.out.println(galaxy);
        galaxy.turnOn();
        galaxy.pay();
        galaxy.useSpecialFunction();
        galaxy.turnOff();
    }
}
