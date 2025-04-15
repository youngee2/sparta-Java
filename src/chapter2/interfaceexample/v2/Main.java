package chapter2.interfaceexample.v2;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Computer computer=new Computer();
        AirConditioner airConditioner= new AirConditioner();

        //inteface turnOn()
        tv.turnOn();
        computer.turnOn();
        airConditioner.turnOn();

        System.out.println("=============");

        //interface turnOff()
        tv.turnOff();
        computer.turnOff();
        airConditioner.turnOff();

        System.out.println("=============");

        //각 전자제품 기능 확장
        tv.changeChannel();
        computer.networkConnection();
        airConditioner.setTemperature();
    }
}
