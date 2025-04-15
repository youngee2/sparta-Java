package chapter2.interfaceexample.v2;

public class AirConditioner implements Electronics{

    @Override
    public void turnOn() {
        System.out.println("에어컨이 작동됩니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨이 꺼집니다.");
    }

    void setTemperature(){
        System.out.println("온도를 설정합니다.");
    }
}
