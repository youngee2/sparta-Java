package chapter1.io;

import java.util.Scanner;

public class UserInfoPrinter {
    public static void main(String[] args) {


        //TODO: 사용자로부터 이름 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String userName = sc.nextLine();

        //TODO: 사용자로부터 나이를 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();



        //TODO: 입력받은 값 출력
        System.out.println("출력 결과:\n이름: "
                + userName +
                "\n나이: " +
                age);

        /*System.out.println("출력결과:");
          System.out.println("이름: "+userName);
          System.out.println("나이: "+age);
        * */
    }
}
