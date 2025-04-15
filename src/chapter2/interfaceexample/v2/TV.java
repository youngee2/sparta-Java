package chapter2.interfaceexample.v2;

public class TV implements Electronics{
    @Override
    public void turnOn() {
        System.out.println("TV를 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    void changeChannel(){
        System.out.println("채널을 변경합니다.");
    }
}
