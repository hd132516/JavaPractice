package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        super(0, 0);
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius) {
        super(centerX, centerY);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return radius * radius * Math.PI;
    }
}
