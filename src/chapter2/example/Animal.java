package chapter2.example;

abstract class Animal extends LifeForm {
   @Override
   public void exist(){
       System.out.println("동물입니다.");
   }

    public void makeSound(){
        System.out.println("소리를 냅니다.");
    }
}
