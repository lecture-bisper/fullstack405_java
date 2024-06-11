public class CatEx {
  public static void main(String[] args) {
//    부모 클래스인 Animal 클래스 타입의 변수 선언
    Animal animal;
//    Animal 클래스를 상속받은 자식 클래스인 Cat 클래스 타입의 객체 선언
    Cat cat = new Cat();
    
//    부모 클래스인 Animal 클래스 타입의 변수에 자식 클래스인 Cat 클래스 타입의 객체를 대입
//    자바의 다형성과 자동 타입 변환에 의해서 자식 클래스 타입의 객체를 부모 클래스 타입의 변수에 대입함
    animal = cat;

//    두 참조 타입의 변수가 가지고 있는 주소가 같은지 확인
    if (cat == animal) {
      System.out.println("cat 과 animal은 같다");
    }
    else {
      System.out.println("cat 과 animal은 다르다");
    }

  }
}












