package chapter2.interfaceexample;

public class Main {
    public static void main(String[] args) {
        //인스턴스화
        LuxuryCar luxuryCar = new LuxuryCar();
        SpeedCar speedCar = new SpeedCar();

        //활용
        //luxuryCar.move();
        //luxuryCar.stop();

        //speedCar.drive();


        //인터페이스 활용
        luxuryCar.drive();
        speedCar.drive();

        luxuryCar.stop();
        speedCar.stop();

        //클래스의 특징을 보존 가능
        luxuryCar.charge();
        speedCar.autoParking();

        //interface에서 변수를 선언하면 public static final로 선언된다. 권장 X
    }
}
