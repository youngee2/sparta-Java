package chapter1.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //출력
        //println 사용
        System.out.println("Hello");
        System.out.println("Java");


        //print 사용
        System.out.print("안녕");
        System.out.print("자바");

        //개행문자 포함 출력
        System.out.println("Hello\nWorld!");


        //입력(Scanner)
        //스캐너 객체를 스캐너형 박스(sc)
        Scanner sc= new Scanner(System.in);
        int a=1;

        //문자열 입력받기
        System.out.print("좋아하는 문장을 입력하세요: ");
        String sentence=sc.nextLine();
        System.out.println("sentence = " + sentence);

        //정수형 입력받기
        System.out.print("정수(int)를 입력하세요: ");
        int intbox=sc.nextInt();
        System.out.println("intbox = " + intbox);


        System.out.print("정수(long)를 입력하세요: ");
        long longbox=sc.nextLong();
        System.out.println("longbox = " + longbox);

        //소수점
        System.out.print("소수점(double)을 입력하세요: ");
        double doublebox=sc.nextDouble();
    }
}
