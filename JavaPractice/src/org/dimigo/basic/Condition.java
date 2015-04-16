package org.dimigo.basic;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 * @author Vista
 */
public class Condition {
    public static void main(String args[]) {
        /**
         * 1: 고속버스
         * 2: 경차
         * 3: 기타 교통수단
         */
        int kind = 1;
        int distance = 25;

        // 통행료 계산 - 기본요금
        int cost = 0;
        switch (kind) {
            case 1: cost = 850; break;
            case 2: cost = 300; break;
            case 3: cost = 600;
        }

        // 할증 계산
        if (distance > 10) {
            int over = kind == 1 ? 300 : 200;
            cost += over * (int)(distance / 10);
        }

        // 출력
        PrintStream out = System.out;
        out.println("<< 고속도로 통행료 계산 >>");
        out.printf("거리: %dkm\n", distance);
        out.printf("차종 : %s\n", kind == 1 ? "고속버스" : (kind == 2 ? "경차" : "그 외"));
        out.printf("통행료 : %d\n", cost);
    }
}
