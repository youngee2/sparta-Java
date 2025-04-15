package chapter2.interitance.abstractexample;

public class Main {
    public static void main(String[] args) {
        //abstract class는 직접 인스턴스화를 할 수 없음.
        //Animal animal = new Animal(); XX 불가.
        Cat cat = new Cat();
        cat.name="cat";
        cat.sleep();
        cat.eat();
    }
}
