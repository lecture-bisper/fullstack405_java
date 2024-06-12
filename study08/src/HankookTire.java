// Tire 인터페이스를 상속받아 구현한 HankookTire 클래스
public class HankookTire implements Tire{
  
//  상속받은 추상 메소드를 오버라이딩하여 사용
  @Override
  public void roll() {
    System.out.println("한국 타이어가 굴러갑니다.");
  }
}












