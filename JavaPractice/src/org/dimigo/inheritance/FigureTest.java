package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class FigureTest {
    public static void main(String args[]) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(10, 10, 5, 8);
        Rectangle r = new Rectangle(20, 20, 5, 8);

        System.out.printf("원의 넓이 : %.1f\n", c.calcArea());
        System.out.printf("삼각형 넓이 : %.1f\n", t.calcArea());
        System.out.printf("사각형 넓이 : %.1f\n", r.calcArea());

        c.printCenter();
        t.printCenter();
        r.printCenter();

        System.out.println("-- 중심좌표 이동 (x, y 5씩)");

        c.moveCenter(5, 5);
        t.moveCenter(5, 5);
        r.moveCenter(5, 5);

        c.printCenter();
        t.printCenter();
        r.printCenter();
    }
}
