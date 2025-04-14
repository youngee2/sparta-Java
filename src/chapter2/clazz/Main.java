package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        //객체 생성
        //Person personA = new Person("Ahyoung",20);
        //Person personB = new Person("Jang",19);
/*
        //속성에 직접 접근
        System.out.println("설정전 personA이름: "+personA.name);
        System.out.println("설정전 personB이름: "+personB.name);
        personA.name="Ahyoung";
        personB.name="Jang";
        System.out.println("설정 후 personA이름: "+personA.name);
        System.out.println("설정 후 personB이름: "+personB.name);



        //기능 활용
        int result1 = personA.sum(1,2);
        int result2= personB.sum(2,4);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        String name= personA.getName();
        System.out.println("name = " + name);
        String name2= personB.getName();;
        System.out.println("name2 = " + name2);


        System.out.println("personA의 주소: "+personA.address);
        personA.setAddress("서울");
        System.out.println("personA의 주소: " + personA.address);


*/
        Car myCar=new Car("나의 자동차","K8");
        myCar.drive();
    }
}