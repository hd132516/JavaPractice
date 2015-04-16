package org.dimigo.basic;

import java.io.PrintStream;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 * @author Vista
 */
public class PrimitiveDataType {

    public static void main(String[] args) {
        String name = "아이유";
        boolean isMan = false;
        int age = 23;
        double height = 161.8;
        float weight = 44.3f;
        char blood = 'A';

        PrintStream cout = System.out;
        cout.println("<< 아이유 프로필 >>");
        cout.printf("이름 : %s\n", name);
        cout.printf("성별 : %s\n", isMan ? "남자" : "여자");
        cout.printf("나이 : %d세\n", age);
        cout.printf("키 : %.1fcm\n", height);
        cout.printf("몸무게 : %.1fkg\n", weight);
        cout.printf("혈액형 : %c\n", blood);
    }
}
