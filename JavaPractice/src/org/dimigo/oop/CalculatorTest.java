package org.dimigo.oop;

import java.io.PrintStream;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class CalculatorTest {
    public static void main(String[] args) {
        int a = 10, b = 20;
        Calculator calc = new Calculator(a, b);
        calc.powerOn();

        PrintStream out = System.out;
        out.printf("%d + %d = %d\n", a, b, calc.add());
        out.printf("%d - %d = %d\n", a, b, calc.sub());
        out.printf("%d * %d = %d\n", a, b, calc.mul());
        out.printf("%d / %d = %.1f\n", a, b, calc.div());

        calc.powerOff();
    }
}
