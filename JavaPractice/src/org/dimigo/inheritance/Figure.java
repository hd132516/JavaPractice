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
}
