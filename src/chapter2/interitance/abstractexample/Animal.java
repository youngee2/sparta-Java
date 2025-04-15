package chapter2.interitance.abstractexample;

//추상클래스 선언
abstract class Animal {
    public String name;

    //abstract는 강제로 자식클래스에서 구현해야해!
    abstract void eat();

    public void sleep(){
        System.out.println("쿨쿨..");
    }

}
