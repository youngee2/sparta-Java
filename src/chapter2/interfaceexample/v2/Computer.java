package chapter2.interfaceexample.v2;

public class Computer implements Electronics {
    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 끕니다.");
    }

    public void networkConnection(){
        System.out.println("네트워크를 연결합니다.");
    }
}
