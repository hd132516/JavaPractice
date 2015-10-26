package org.dimigo.interfaces;

/**
 * SmartPhone - The abstraction of smartphone
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 * @since 2015.09.07
 */
public class SmartPhone extends Phone implements Chargable {

    public SmartPhone() {
    }

    /**
     * SmartPhone을 초기화한다.
     * @param model 휴대폰 모델명
     * @param company 휴대폰 제조사
     * @param price 가격
     */
    public SmartPhone(String model, String company, int price) {
        super(model, company, price);
    }

    /**
     * @return 스마트폰의 영상통화 여부 (always true)
     */
    @Override
    protected boolean canVideoCall() {
        return true;
    }

    /**
     * 스마트폰의 충전을 시작한다.
     */
    @Override
    public void startCharging() {
        System.out.println(getModel() + "의 충전을 시작합니다.");
    }

    /**
     * 스마트폰의 충전을 종료한다.
     */
    @Override
    public void stopCharging() {
        System.out.println(getModel() + "의 충전을 종료합니다.");
    }

    /**
     * 스마트폰에 앱을 설치한다.
     */
    public void installApp() {
        System.out.println(getModel() + "로 어플리케이션을 설치합니다.");
    }

    /**
     * 스마트폰에 앱을 삭제한다.
     */
    public void uninstallApp() {
        System.out.println(getModel() + "로 어플리케이션을 삭제합니다.");
    }
}
