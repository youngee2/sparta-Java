package chapter2.clazz;

public class Car {
    //속성
    String name;
    String carModel;

    //생성자
    public Car(String name, String carModel){
        this.name=name;
        this.carModel=carModel;
    }

    //기능
    public void drive(){
        System.out.println(name+"["+carModel+"] 을 주행합니다.");
    }
}
