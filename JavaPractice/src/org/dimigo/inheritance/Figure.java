package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Figure {
    private int centerX;
    private int centerY;

    public Figure(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    protected double calcArea() {
        return 0.0;
    }

    protected void printCenter() {
        System.out.printf("중심 좌표 : (%d, %d)\n", centerX, centerY);
    }

    protected void moveCenter(int x, int y) {
        this.centerX += x;
        this.centerY += y;
    }
}
