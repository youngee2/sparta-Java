package chapter2.example;

public class Dog extends Animal{

    //LifeForm
    @Override
    public void exist(){
        System.out.println("강아지입니다.");
    }

    //Animal
    @Override
    public void makeSound(){
        System.out.println("멍멍");
    }
    
    public void wag(){
        System.out.println("흔들흔들");
    }

}
