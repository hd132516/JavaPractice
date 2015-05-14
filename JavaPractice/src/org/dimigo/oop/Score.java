package org.dimigo.oop;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Score {
    public static void main(String[] args) {
        int kor, math, eng;
        Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("국어 점수 입력 => ");
        kor = scanner.nextInt();
        out.print("수학 점수 입력 => ");
        math = scanner.nextInt();
        out.print("영어 점수 입력 => ");
        eng = scanner.nextInt();

        StringBuilder builder = new StringBuilder()
                .append("<< 점수 출력 >>\n")
                .append("국어 점수 : ").append(kor).append(" 점\n")
                .append("수학 점수 : ").append(math).append(" 점\n")
                .append("영어 점수 : ").append(eng).append(" 점\n")
                .append("총점 : ").append(kor + math + eng).append(" 점\n")
                .append(String.format("평균 : %.1f점\n", (double) (kor + math + eng) / 3));
        out.print(builder.toString());
    }
}
