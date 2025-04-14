package chapter1.method;

public class Main {
    public static void main(String[] args) {
        //1. 객체를 객체화(소환)
        Calculator calculator = new Calculator();

        //[정수형] 상자 = 정수

        //2. 함수를 호출
        int sum=calculator.sum(1,2);

        System.out.println(sum);
    }
}
