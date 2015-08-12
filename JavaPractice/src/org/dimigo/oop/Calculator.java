package org.dimigo.oop;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Calculator {
    private int num1;
    private int num2;


    public Calculator() {
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void powerOn() {
        System.out.println("전원을 킵니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    int add() {
        return num1 + num2;
    }

    int sub() {
        return num1 - num2;
    }

    int mul() {
        return num1 * num2;
    }

    double div() {
        return num1 / num2;
    }
}
