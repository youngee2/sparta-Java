package chapter1.operator;

public class Main2 {
    public static void main(String[] args) {
        int a=15;
        int b=4;

        //1. 더하기
        int sum=a+b;
        //1. 더하기 결과 출력
        System.out.println("덧셈 결과: " + sum);

        //2. 빼기
        int difference=a-b;
        //2. 빼기 결과 출력
        System.out.println("뺄셈 결과: " + difference);

        //3.곱하기
        int product = a*b;
        //3.곱하기 결과 출력
        System.out.println("곱셈 결과: "+product);

        //4. 나누기
        int quotient=a/b;
        //4. 나누기 결과 출력
        System.out.println("나눗셈 결과: "+quotient);

        //5. 나머지
        int remainder=a%b;
        //5. 나머지 결과 출력
        System.out.println("나머지 결과: "+remainder);
    }
}
