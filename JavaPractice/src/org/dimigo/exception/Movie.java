package org.dimigo.exception;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class Movie {
    private String title;
    private int limitAge;

    public Movie(String title, int limitAge) {
        this.title = title;
        this.limitAge = limitAge;
    }

    public String getTitle() {
        return title;
    }

    public int getLimitAge() {
        return limitAge;
    }
}
