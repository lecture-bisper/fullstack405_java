public class Driver {

//  drive 라는 메소드가 사용하는 매개변수가 Vehicle 인터페이스 타입
//  해당 매개변수로 올 수 있는 객체는 Vehicle 인터페이스를 상속받은 Bus/Taxi 클래스의 객체만 올 수 있음
  public void drive(Vehicle v) {
    v.run();
  }
}












