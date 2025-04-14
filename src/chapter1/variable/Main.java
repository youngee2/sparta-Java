package chapter1.variable;

public class Main {
    public static void main(String[] args) {
        // [자료형] [변수 이름];
        int a;
        a=1;
        a=2;
        System.out.println("a = "+a);
        
        //논리형
        boolean booleanBox=true;
        booleanBox=false;
        System.out.println("booleanBox = " + booleanBox);

        //문자형
        char charBox='a';
        charBox='b';
        System.out.println("charBox = " + charBox);

        //큰 정수형
        long longBox=1; //8byte
        longBox=2;
        System.out.println("longBox = " + longBox);

        //실수형
        float floatBox=0.12345678f;
        System.out.println("floatBox = " + floatBox);
        //f를 뒤에 안쓰면 double형으로 인식
        //소수점6~7자리까지

        double doubleBox=0.1234567890;
        System.out.println("doubleBox = " + doubleBox);
    //캐스팅(Casting)


        //다운캐스팅: 큰 데이터를 작은 데이터타입에 넣는 것.
        //명시적 변환
        double bigBox=10.123;
        int smallBox=(int)bigBox;
        System.out.println("smallBox = " + smallBox);
        //데이터 손실 있음.
        //10.123을 넣었지만 10으로 출력


        //업캐스팅: 작은 데이터를 큰 데이터타입에 넣는 것
        int smallBox2=10;
        double bigBox2=smallBox2; //형변환 할 필요X
        System.out.println(bigBox2); //데이터손실 x

        //문자열 데이터
        String str = "안녕하세요!";
        System.out.println("str = " + str);
    }
}
