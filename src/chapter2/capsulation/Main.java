package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {

        //생성자 호출
        Person person=new Person("Ahyoung"," ?");
        //생성 시점에만 한 번만 설정하면 외부에서 바꿀 수 없음. 접근 자체가 X

        //인스턴스 변수 접근
        // person.name="Ahyoung";
        //private는 같은 클래스가 아니면 접근 불가.
        //person.secret="??"

        //인스턴스 메서드 접근
        person.methodA();
        //private는 같은 클래스가 아니면 접근 불가.
//        person.methodB();

    //getter
        String name=person.getName();
        //접근이 안될경우, getter를 활용해서
        //우리가 필요한 데이터에 접근을 바로 할 수 있음.
        System.out.println(name);


    //setter
    //변경할 일이 있는 경우
        person.setName("아영");
        String name2=person.getName();
        System.out.println(name2);
    }



}
