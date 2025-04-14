package chapter1.array;

public class PrefixSum {
    public static void main(String[] args) {
        //아래의 정수 배열의 누적합을 구하세요.
        //배열 예시: {2, 5, 8}
        int[] arr={2,5,8};
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println("누적합: " + sum);
    }
}
