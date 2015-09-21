package org.dimigo.exception;

/**
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 */
public class AgeCheckException extends Exception {
    public AgeCheckException() {
        super();
    }

    public AgeCheckException(Movie movie) {
        super(movie.getTitle() + "은/는 " + movie.getLimitAge() + " 관람가입니다.");
    }
}
