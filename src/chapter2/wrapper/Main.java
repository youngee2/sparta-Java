package chapter2.wrapper;

public class Main {
    public static void main(String[] args) {
        //기본형 변수
        int a=1;
        System.out.println("a = "+a);

        //참조형 변수
        Person personA=new Person();
        System.out.println("personA = " + personA); //Heap 영역에 객체의 주소값

        int[] arr ={1,2,3,4,5};
        System.out.println(arr); //배열도 메모리의 주소 값

        //래퍼클래스(기본형 변수를 감싸고 있는 클래스)
        //참조형 변수
        //래퍼클래스는 참조형 변수인데도 불구하고 내부적으로 toString()이 오버라이딩 처리된다.
        //래퍼클래스를 사용하는 이유는 기능을 제공하기 때문에 편리하게 데이터 처리 가능
        Integer num=100;
        System.out.println("num = "+num);

        //toString()은 정수형 데이터를 바로 문자열 데이터로 변경해주는 역할.
        String numStr = num.toString();

        //직접 만든 래퍼클래스
        CustomInteger myInteger = new CustomInteger(10);
        String myStrInteger = myInteger.toString();

        //오토박싱(기본형 -> 래퍼)
        Integer num3 = 10;
        //Integer num3=Integer.valueOf(10);

        //오토언박싱(래퍼형 -> 기본형)
        int num4 = num3;
        //내부적으론 이렇게 처리.
        //int num4=num.intValue();






    }

}
