package chapter2.interitance;

public class Child extends Parent {
    public String familyName="ahyoung";


    //부모 생성자가 먼저 생성이 되어야한다.
    //그러니 super 아래에 작성.
    public Child(){
        super();
        System.out.println("자식생성자");
    }

    public void superTest(){
        System.out.println(super.familyName);
    }

    public void showSocialMedia(){
        System.out.println("sns에서 우리 가문을 소개드립니다.");
    }

    //부모와 같은 기능을 재정의.
    @Override
    public void introduceFamily(){
        System.out.println("오버라이드");
    }

}
