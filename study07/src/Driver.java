// 일반적인 클래스
public class Driver {
//  메소드의 매개변수로 Taxi/Bus 클래스의 부모 클래스인 Vehicle 클래스 타입의 변수를 사용함 
//  Vehicle 클래스 타입의 변수에 입력할 수 있는 데이터는 Vehicle 클래스 타입의 객체, Vehicle 클래스를 상속받은 Taxi/Bus 클래스 타입의 객체
  public void drive(Vehicle v) {
    v.run();
  }
}












