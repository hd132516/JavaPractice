package org.dimigo.basic;

import java.io.PrintStream;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 * @author Vista
 */
public class Operator {
    public static void main(String[] args) {
        double ladderA = 9, ladderB = 10, ladderHeight = 5.8;
        double parallelA = 9, parallelHeight = 5.4;

        double ladder = (ladderA + ladderB) * ladderHeight /  2;
        double parallel = parallelA * parallelHeight;

        PrintStream out = System.out;
        out.println("<< 도형 넓이 비교 >>");
        out.printf("사다리꼴 넓이 : %.1f\n", ladder);
        out.printf("평행사번형 넓이 : %.1f\n\n", parallel);

        if (ladder > parallel) out.printf("사다리꼴이 평행사변형보다 %.1f 더 큽니다.\n", ladder - parallel);
        else if (ladder < parallel) out.printf("평행사변형이 사다리꼴보다 %.1f 더 큽니다.\n", parallel - ladder);
        else out.println("두 도형의 넓이가 같습니다."); // THIS WILL NOT HAPPEN
    }
}
