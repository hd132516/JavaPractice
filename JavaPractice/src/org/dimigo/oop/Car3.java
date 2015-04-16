package org.dimigo.oop;

/**
 * Car3 - Abstraction of the car (Subclass of {@link Car})
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Car3 extends Car {

    public Car3(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
}
