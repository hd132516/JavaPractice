package org.dimigo.inheritance;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Rectangle extends Figure {
    private int width, height;

    public Rectangle(int width, int height) {
        super(0, 0);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int centerX, int centerY, int width, int height) {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    protected void printCenter() {
        System.out.print("사각형 ");
        super.printCenter();
    }
}
