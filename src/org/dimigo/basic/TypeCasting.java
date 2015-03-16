package org.dimigo.basic;

import java.io.PrintStream;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 * @author Vista
 */
public class TypeCasting {

    public static void main(String[] args) {
        int pay = 1700000;
        int employeeCount = 3;
        int storeCount = 1500;
        long yearlyPay = (long) pay * employeeCount * storeCount * 12;

        PrintStream out = System.out;
        out.println("<<디미베네 연간 인건비>>");
        out.printf("월 평균 급여 : %,d원\n", pay);
        out.printf("점포 내 직원 수 : %d명\n", employeeCount);
        out.printf("점포 수 : %,d개\n\n", storeCount);
        out.printf("연간 인건비 : %,d원\n", yearlyPay);
    }
}
