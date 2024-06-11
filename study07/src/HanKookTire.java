// 부모 클래스인 Tire 클래스를 상속받아 사용하는 HanKookTire 클래스
public class HanKookTire extends Tire{
//  필드는 상속받은 필드 그대로 사용

//  생성자, 매개변수로 타이어 위치와 최대 회전수를 받음
  public HanKookTire(String location, int maxRotation) {
//    super() 부모 클래스의 생성자 호출
    super(location, maxRotation);
  }

//  상속받은 메소드를 오버라이딩으로 수정하여 사용
  @Override
  public boolean roll() {
    ++accRotation; // 누적 회전수 증가
    if (accRotation < maxRotation) {
      System.out.println(location + " HankookTire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("***** " + location + " HankookTire 펑크 *****");
      return false;
    }
  }
}












