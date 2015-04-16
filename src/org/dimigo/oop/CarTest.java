package org.dimigo.oop;

import java.io.PrintStream;

/**
 * CarTest - Testing of the Car Class
 *
 * Copyright (C) 2015 Therne. All rights are reserved.
 * @author Vista
 */
public class CarTest {
    public static void main(String args[]) {
//        Car hyundai = new Car();
//        hyundai.setCompany("현대자동차");
//        hyundai.setModel("제네시스");
//        hyundai.setColor("검정색");
//        hyundai.setMaxSpeed(225);
//        hyundai.setPrice(50000000);
//
//        Car kia = new Car();
//        kia.setCompany("기아자동차");
//        kia.setModel("K7");
//        kia.setColor("흰색");
//        kia.setMaxSpeed(246);
//        kia.setPrice(40000000);
//
//        Car samsung = new Car();
//        samsung.setCompany("삼성자동차");
//        samsung.setModel("SM7");
//        samsung.setColor("회색");
//        samsung.setMaxSpeed(200);
//        samsung.setPrice(38000000);

        // Using Car2 (constructor)
        Car2 hyundai = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
        Car2 kia     = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
        Car2 samsung = new Car2("삼성자동차", "SM7", "회색", 205, 38000000);

        // print
        PrintStream out = System.out;
        out.println("<< 자동차 목록 >>");
        out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도: %dkm\n가격: %,d원\n\n",
                hyundai.getCompany(),
                hyundai.getModel(),
                hyundai.getColor(),
                hyundai.getMaxSpeed(),
                hyundai.getPrice());
        out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도: %dkm\n가격: %,d원\n\n",
                kia.getCompany(),
                kia.getModel(),
                kia.getColor(),
                kia.getMaxSpeed(),
                kia.getPrice());
        out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도: %dkm\n가격: %,d원\n",
                samsung.getCompany(),
                samsung.getModel(),
                samsung.getColor(),
                samsung.getMaxSpeed(),
                samsung.getPrice());
    }
}
