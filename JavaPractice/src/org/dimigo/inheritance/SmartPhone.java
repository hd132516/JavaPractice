package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class SmartPhone {
    private String model, company;
    private int price;

    public SmartPhone() {}

    public SmartPhone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public void turnOn() {
        System.out.println(model+"의 전원을 켭니다");
    }

    public void turnOff() {
        System.out.println(model+"의 전원을 켭니다");
    }

    public void pay() {
    }

    public void useSpecialFunction() {
        if (this instanceof IPhone) {
            ((IPhone) this).useAirDrop();

        } else if (this instanceof Galaxy) {
            ((Galaxy) this).useWirelessCharging();
        }
    }

    @Override
    public String toString() {
        return String.format("모델명 : %s, 제조사: %s, 가격 : %,d원", model, company, price);
    }
}
