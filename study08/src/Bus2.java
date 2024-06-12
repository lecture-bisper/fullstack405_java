public class Bus2 implements Vehicle2{
  
//  추상 메소드를 상속받아 오버라이딩하여 사용
  @Override
  public void run() {
    System.out.println("버스가 달립니다.");
  }

//  Bus2 클래스 타입 전용 메소드
  public void checkFare() {
    System.out.println("승차요금을 확인하빈다.");
  }
}












