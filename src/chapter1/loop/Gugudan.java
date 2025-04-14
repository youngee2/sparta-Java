package chapter1.loop;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단 단수를 입력하세요 (2~9): ");
        int num = sc.nextInt();

        System.out.println("==== "+num+"단 ====");
        for(int i=1; i<=9; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
