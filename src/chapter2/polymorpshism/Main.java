package chapter2.polymorpshism;

public class Main {
    public static void main(String[] args) {
        //다형성 활용
        //하나의 데이터 타입으로 하위계층의 객체들을
        //활용할 수 있는 것을 다형성이라 한다.
        //업캐스팅
        Animal animal1=new Cat();
        Animal animal2=new Dog();


        animal1.exist();
        animal1.makeSound();
        animal2.exist();
        animal2.makeSound();
        
        //업캐스팅 주의사항
        //업캐스팅은 부모의 타입으로 데이터를 다룰 수 있지만
        //자식 클래스의 고유 기능을 활용할 수 없음.
        // 불가 -> animal1.scratch();
        // 불가 -> animal2.wag();

        //다운캐스팅
        Cat cat1= (Cat)animal1;
        cat1.scratch();

        Dog dog1 = (Dog)animal2;
        dog1.wag();

        
        //다운캐스팅시 instanceof 활용 방법
        if(animal2 instanceof Cat){
            Cat cat2 = (Cat)animal2;
            cat2.scratch();
        }else{
            System.out.println("객체가 고양이가 아닙니다!");
        }


        Animal[] animals={new Cat(),new Dog()};
        System.out.println("::::");
        for(Animal animal:animals){
            animal.makeSound();
        }
    }
}
