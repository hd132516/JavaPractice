package org.dimigo.interfaces;

/**
 * SmartPhone - The abstraction of wired phone (non-mobile)
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 * @since 2015.09.07
 */
public class WirePhone extends Phone {

    public WirePhone() {
    }

    /**
     * 유선 전화기를 초기화한다.
     * @param model 모델명
     * @param company 제조사
     * @param price 가격
     */
    public WirePhone(String model, String company, int price) {
        super(model, company, price);
    }

    /**
     * @return 영상통화 여부 (always false)
     */
    @Override
    protected boolean canVideoCall() {
        return false;
    }
}
