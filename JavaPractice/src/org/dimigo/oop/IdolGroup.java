package org.dimigo.oop;

import java.util.Arrays;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class IdolGroup {
    public static void main(String[] args) {
        String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
        String[][] members = {
                {"GD", "태양", "대성", "탑", "승리"},
                {"CL", "산다라박", "박봄", "민지"},
                {"유라", "혜리", "소진", "민아"}
        };

        for (int i=0; i<idolGroup.length; i++) {
            System.out.println("<< " + idolGroup[i] + " 멤버 >>");
            for (String member : members[i]) System.out.println(member);
            System.out.println();
        }
    }
}
