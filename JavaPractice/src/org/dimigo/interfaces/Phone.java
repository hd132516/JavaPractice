package org.dimigo.interfaces;

/**
 * The abstraction of all phones and
 * the base class of other phone classes.
 *
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 * @since 2015.09.07
 */
public abstract class Phone {
    private String model, company;
    private int price;

    public Phone() {

    }

    /**
     * 휴대폰을 초기화한다.
     * @param model 휴대폰 모델명
     * @param company 휴대폰 제조사
     * @param price 가격
     */
    public Phone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    /**
     * @return 제조사명
     */
    public String getModel() {
        return model;
    }

    /**
     * @return 가격
     */
    public int getPrice() {
        return price;
    }

    /**
     * 음성 통화를 수행한다.
     */
    public void voiceCall() {
        System.out.println(model + "로 음성 통화를 합니다.");
    }

    /**
     * 영상 통화가 가능한지 반환한다.
     * @return 영상 통화 여부
     */
    protected abstract boolean canVideoCall();

    /**
     * 영상 통화를 수행한다.
     */
    public void videoCall() {
        if (canVideoCall()) {
            System.out.println(model + "로 영상 통화를 합니다.");
        }
        else System.out.println(model + "은/는 영상 통화를 지원하지 않습니다.");
    }

    @Override
    public String toString() {
        return String.format("Phone [model=%s, company=%s, price=%d]", model, company, price);
    }
}
