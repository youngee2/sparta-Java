package chapter2.finalexample;

public class Main {
    public static void main(String[] args) {
        //변수는 변경이 불가능하게 만든다.
        //클래스는 상속할 수 없게 만든다.
        //final로 선언된 메서드는 오버라이딩 불가.
        //static final
        final int a = 1;
        //a = 2;
        System.out.println("a= " + a);
        System.out.println(Circle.PI);

        //불변 객체 활용
        //final은 참조값 변경은 막아주지만 객체 내부의 변경은 못막음

        final Circle c1 = new Circle(2);
        //c1=new Circle(2); 참조값 ㅂ변경 불가
       // c1.radius=5; //final 키워드가 붙어있지 않은 radius는 내부 변경 가능.
        //

        System.out.println("c1 = " + c1);

        //불변 객체의 내부상태가 변경이 필요한 경우ㄴㄴㄴ
        Circle c2 = new Circle(10); //생성자
        Circle c3=c2.changeRadius(12); //기능을 활용
        System.out.println("c2 = " + c2);

    }
}
