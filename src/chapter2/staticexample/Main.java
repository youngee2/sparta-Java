package chapter2.staticexample;

public class Main {
    public static void main(String[] args) {
        //객체 생성 안하고 클래스 레벨에 접근해서 바로 사용 가능.
        //클래스 멤버
        //static 변수, 메서드 활용
        System.out.println("static 변수 활용: "+Person.population);
        Person.printPopulation();

        //인스턴스 멤버 활용
        Person p1 = new Person();
        Person p2 = new Person();
        //인스턴스 변수 활용
        p1.name="ahyoung";
        p2.name="Jang";
        //인스턴스 메서드 활용
        p1.printName();
        p2.printName();

        Person.printPopulation();
    }
}
