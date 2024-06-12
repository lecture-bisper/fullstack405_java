// 추상 클래스 Animal을 상속받아 사용하는 Cat 클래스
public class Cat extends Animal{

  public Cat() {
    this.kind = "포유류";
  }

//  추상 클래스 Animal에서 추상 메소드 sound()를 상속받아 오버라이딩하여 Cat 클래스 전용 일반 메소드로 사용
  @Override
  public void sound() {
    System.out.println("야옹");
  }
}












