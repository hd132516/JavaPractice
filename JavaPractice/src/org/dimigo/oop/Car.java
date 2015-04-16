package org.dimigo.oop;

/**
 * Car - Abstraction of the car
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Car {
    protected String company;
    protected String model;
    protected String color;
    protected int maxSpeed;
    protected int price;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
