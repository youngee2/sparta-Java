package chapter2.example;

public class Cat extends Animal{
    @Override
    public void exist(){
        System.out.println("고양이가 있습니다.");
    }
    
    @Override
    public void makeSound(){
        System.out.println("냐옹");
    }
    
    public void scratch(){
        System.out.println("스크래치");
    }
}
