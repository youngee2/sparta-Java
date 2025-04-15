package chapter2.example;

public class Main {
    public static void main(String[] args) {
        //업캐스팅
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        //다운캐스팅
        if(animal1 instanceof Cat) {
            Cat cat = (Cat) animal1;
            cat.scratch();
        }else{
            System.out.println("객체가 고양이가 아닙니다.");
        }


        //다운캐스팅
        if(animal2 instanceof Dog) {
            Dog dog = (Dog) animal2;
            dog.wag();
        }else{
            System.out.println("객체가 강아지가 아닙니다.");
        }

        //다운캐스팅 animal 객체가 Dog가 아닌 경우.
        if(animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;
            dog.wag();
        }else{
            System.out.println("객체가 강아지가 아닙니다.");
        }

    }
}
