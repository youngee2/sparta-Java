package chapter2.clazz;

public class Person {
    //1. 속성 - 변수 선언으로 표현할 수 있습니다.
    String name;
    int age;
    String address;

    //2.생성자 - 조립설명서
    //기본생성자: Person(){}
    //생성자의 특징:
    //1. 클래스와 이름이 같음
    //2. 반환타입이 존재

    Person(String name, int age){
    this.name=name;
    this.age=age;
    }

    //기능(메서드)
    int sum(int value1, int value2){
        int result=value1+value2;
        return result;
    }

    //게터
    String getName(){
        return this.name;
    }

    //세터 - 속성 설정
    void setAddress(String address){
        this.address=address;
    }
}