package org.dimigo.interfaces;

/**
 * SmartPhone - The abstraction of feature phone
 * Copyright (C) 2015 Therne. All rights are reserved.
 *
 * @author Vista
 * @since 2015.09.07
 */
public class FeaturePhone extends Phone implements Chargable {
    private boolean canVideoCall;

    public FeaturePhone() {
    }

    /**
     * 피쳐폰을 초기화한다.
     * @param model 모델명
     * @param company 제조사
     * @param price 가격
     * @param canVideoCall 영상통화 여부
     */
    public FeaturePhone(String model, String company, int price, boolean canVideoCall) {
        super(model, company, price);
        this.canVideoCall = canVideoCall;
    }

    /**
     * @return 영상통화 여부
     */
    @Override
    protected boolean canVideoCall() {
        return canVideoCall;
    }

    /**
     * 피쳐폰의 충전을 시작한다.
     */
    @Override
    public void startCharging() {
        System.out.println(getModel() + "의 충전을 시작합니다.");
    }

    /**
     * 피쳐폰의 충전을 종료한다.
     */
    @Override
    public void stopCharging() {
        System.out.println(getModel() + "의 충전을 종료합니다.");
    }
}
