package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ PhoneTest
 *
 * 1. 개요 : Phone 클래스 테스팅
 * 2. 작성일 : 2015. 9. 2.
 * </pre>
 *
 * @author		: 김효준
 * @version		: 1.0
 */
public class PhoneTest {

    public static void main(String[] args) {
        // Phone 타입 배열 생성
        Phone[] phones = {
                new WirePhone("GS460", "LG", 28000),
                new FeaturePhone("애니콜", "삼성", 70000, true),
                new FeaturePhone("노키아", "MS", 40000, false),
                new SmartPhone("IPhone6", "애플", 750000)
        };

        int sum = 0;

        for(Phone phone : phones) {
            // 1. 총금액 계산
            sum += phone.getPrice();

            // 2. toString() 출력
            System.out.println(phone);

            // 3. voiceCall() 호출
            phone.voiceCall();

            // 4. videoCall() 호출
            phone.videoCall();

            // 5. Chargable 인터페이스 타입인 경우 startCharging(), stopCharging() 호출
            if (phone instanceof Chargable) {
                Chargable chargable = (Chargable) phone;
                chargable.startCharging();
                chargable.stopCharging();
            }

            // 6. SmartPhone 클래스 타입인 경우 installApp(), uninstallApp() 호출
            if (phone instanceof SmartPhone) {
                SmartPhone smart = (SmartPhone) phone;
                smart.installApp();
                smart.uninstallApp();
            }

            System.out.println();
        }

        System.out.println("총 금액 : " + String.format("%,d", sum) + "원");
    }

}
