package org.dimigo.oop;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Question {

    private static final String SINGER_ANSWER = "오아시스",
            ACTOR_ANSWER = "조인성",
            SUBJECT_ANSWER = "자바";

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;

        out.println("가장 좋아하는 가수는?");
        String answer = scanner.nextLine();
        if (SINGER_ANSWER.equals(answer)) out.println("정답입니다! ^^7");
        else out.println("틀렸습니다!! ^^");

        out.println("가장 좋아하는 배우는?");
        answer = scanner.nextLine();
        if (ACTOR_ANSWER.equals(answer)) out.println("정답입니다! ^^7");
        else out.println("틀렸습니다!! ^^");

        out.println("가장 좋아하는 과목은?");
        answer = scanner.nextLine();
        if (SUBJECT_ANSWER.equals(answer)) out.println("정답입니다! ^^7");
        else out.println("틀렸습니다!! ^^");

        scanner.close();
    }
}
