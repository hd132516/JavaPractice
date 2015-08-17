package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Triangle extends Figure {
    private int width, height;

    public Triangle(int width, int height) {
        super(0, 0);
        this.width = width;
        this.height = height;
    }

    public Triangle(int centerX, int centerY, int width, int height) {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height * 0.5;
    }

    @Override
    protected void printCenter() {
        System.out.print("삼각형 ");
        super.printCenter();
    }
}
