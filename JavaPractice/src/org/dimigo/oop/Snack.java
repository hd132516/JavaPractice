package org.dimigo.oop;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Snack {
    private String name, company;
    private int price, number;

    public Snack() {

    }

    public Snack(String name, String company, int price, int number) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printSnack() {
        System.out.println("이름 : " + name);
        System.out.println("제조사 : " + company);
        System.out.printf("가격 : %,d원\n", price);
        System.out.println("개수 : " + number + "개\n");
    }

    public int calcPrice() {
        return price * number;
    }
}
