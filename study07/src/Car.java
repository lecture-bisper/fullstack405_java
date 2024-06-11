// 부모 클래스로 사용되는 Car 클래스
public class Car {

//  필드
  public int speed;

//  메소드
  public void speedUp() {
    speed += 1;
  }

//  final 메소드, 상속은 가능하지만 오버라이딩은 불가능
  public final void stop() {
    System.out.println("차를 멈춤");
    speed = 0;
  }

}












