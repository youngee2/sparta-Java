package chapter2.wrapper;

public class DoubleWrapperPerformance {
    public static void main(String[] args) {
        int iteration=10_000_000;

        //기본형
        long startTime = System.nanoTime();
        double sum=0.0;
        for(int i=0; i<iteration; i++) {
            sum+=i*1.1;
        }
        long endTime = System.nanoTime();
        long primitiveTime=endTime-startTime;



        //래퍼
        long startTime2=System.nanoTime();
        MyDouble sum3 = new MyDouble(0.0);
        for(int i=0; i<iteration; i++) {
            sum3=sum3.add(new MyDouble(i*1.1));
        }
        long endTime2=System.nanoTime();
        long myTime=endTime2-startTime2;


        System.out.println("기본형 연산 시간: "+primitiveTime);
        System.out.println("MyDouble 클래스 연산 시간: "+myTime);
        System.out.println("기본형과 래퍼클래스 성능 차이: "+myTime/primitiveTime);
    }
}
