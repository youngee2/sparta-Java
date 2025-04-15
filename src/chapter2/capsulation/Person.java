package chapter2.capsulation;

public class Person {

    //캡슐화를 구현할 때 일단 다 private로 구현.(데이터 보호)
    //이 기능이 외부로 노출이 필요해! 하는 것만 public

    //속성
    private String name;
    private String secret;

    //생성자
    //접근제어자를 명시X -> default (클래스 내부, 패키지 내부 접근 가능)
    //생성 시점에 한 번에 받아서 객체에 대한 인스턴스 멤버들을 설정.
    public Person(String name, String secret){
        this.name=name;
        this.secret=secret;
    }

    //}

    //기능
    public void methodA(){}
    private void methodB(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
