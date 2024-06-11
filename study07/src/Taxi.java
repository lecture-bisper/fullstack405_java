// Vehicle 클래스를 상속받아 사용하는 Taxi 클래스
public class Taxi extends Vehicle{

//  Vehicle 클래스에서 상속받은 run() 메소드를 오버라이딩하여 사용함
  @Override
  public void run() {
    System.out.println("택시가 달립니다.");
  }
}












