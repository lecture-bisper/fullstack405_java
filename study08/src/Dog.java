// 추상 클래스 Animal 을 상속받아 사용하는 Dog 클래스
public class Dog extends Animal{

//  Animal 클래스에서 상속받은 필드 kind와 메소드 breathe() 를 가지고 있음
  
//  생성자
  public Dog() {
    this.kind = "포유류";
  }

// 추상 클래스 Animal에서 상속받은 추상 메소드 sound()를 오버라이딩하여 Dog 클래스 전용 일반 메소드로 사용
  @Override
  public void sound() {
    System.out.println("멍멍");
  }
}












