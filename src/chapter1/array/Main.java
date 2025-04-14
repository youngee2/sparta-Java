package chapter1.array;

public class Main {
    public static void main(String[] args) {


        //모험가 명단을 관리하는 법:

        String name1 = "gim";
        String name2 = "gim2";

        String[] adventurerList = {name1, name2};

        //1. 배열 선언
        int[] arr;
        //2. 배열 길이 할당
        arr = new int[5];
        
        //3. 배열 선언과 길이 동시에 할당
        int[] arr2= new int[5];

        //4. 배열 선언과 동시에 배열의 요소 할당
        int[] arr3= {10,20,30,40,50};

        System.out.println("배열의 1번째 요소 접근: "+arr3[0]);

        int length=arr3.length;
        System.out.println(length);


        //문자열 배열
        String[] strArr = new String[2];

        //논리형 배열 선언
        boolean[] booleanArr=new boolean[3];

        for(int i=0; i<arr3.length; i++){
            System.out.println("인덱스: "+i+"의 값:"+arr3[i]);
        }




    }
}
