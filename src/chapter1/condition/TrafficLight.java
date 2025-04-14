package chapter1.condition;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
        String light=sc.nextLine();

        /* if
        if(light.equals("초록불")){
            System.out.println("건너세요!");
        }else if(light.equals("노란불")){
            System.out.println("주의하세요!");
        }else if(light.equals("빨간불")){
            System.out.println("멈추세요!");
        }else{
            System.out.println("잘못된 입력입니다.");
        }
         */

        //switch문
        switch (light){
            case "초록불":
                System.out.println("건너세요!");
                break;
            case "노란불":
                System.out.println("주의하세요!");
                break;
            case "빨간불":
                System.out.println("멈추세요!");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }


    }
}
