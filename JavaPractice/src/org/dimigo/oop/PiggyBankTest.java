package org.dimigo.oop;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class PiggyBankTest {
    public static void main(String args[]) {
        FamilyMember father = new FamilyMember("아빠"),
                mother = new FamilyMember("엄마"),
                me = new FamilyMember("나"),
                brother = new FamilyMember("남동생");

        FamilyMember.printMemberCnt();

        PiggyBank.putMoney(father, 10000);
        PiggyBank.putMoney(mother, 5000);
        PiggyBank.putMoney(me, 2000);
        PiggyBank.putMoney(brother, 1000);

        PiggyBank.printBalance();

        PiggyBank.putMoney(me, 1000);
        PiggyBank.printBalance();
    }
}
