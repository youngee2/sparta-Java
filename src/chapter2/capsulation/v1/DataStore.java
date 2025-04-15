package chapter2.capsulation.v1;

//핵시설 관리하는 개발자
public class DataStore {
    //"B"문자열이 들어오면 핵폭발 발생!!!!!!!!!!!!!!!!!!!!!!
    private String store;

    //무분별한 setter 방지 예시 1
    //무분별한 setter란 접근을 막아놓고 다시 세터로 외부에 노출한다면, 접근제어를 하는 의미 X
    // 이런 경우 올바른 데이터만 저장될 수 있도록 제한해야 함.
    public void setStore(String store) {
        if(store.equals("B")){
            System.out.println("B가 입력되면 안됩니다.");
        }else{
        this.store = store;
    }
}
}
