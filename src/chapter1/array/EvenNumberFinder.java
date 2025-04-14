package chapter1.array;

public class EvenNumberFinder {
    public static void main(String[] args) {
        //아래의 정수 배열이 주어졌을 때 짝수만 출력하세요.
        //{3,4,7,10,15,20}
        //예상 출력:
        //짝수: 4 10 20


        int arr[] = {3, 4, 7, 10, 15, 20};

        System.out.print("짝수: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
