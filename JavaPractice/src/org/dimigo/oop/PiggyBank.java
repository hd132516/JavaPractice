package org.dimigo.oop;

import java.util.HashMap;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class PiggyBank {
    private static int balance;

    public static void putMoney(FamilyMember member, int amount) {
        balance += amount;
        System.out.printf("%s %d원 넣음\n", member.getMemberName(), amount);
    }

    public static void printBalance() {
        System.out.println("돼지저금통 총 금액 : " + balance + "원");
    }
}
