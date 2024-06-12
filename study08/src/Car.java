public class Car {

//  Car 클래스의 필드
//  인터페이스 타입의 변수에 자식 클래스 타입의 객체를 대입
  Tire frontLeftTire = new HankookTire();
  Tire frontRightTire = new HankookTire();
  Tire backLeftTire = new KumhoTire();
  Tire backRightTire = new KumhoTire();

//  인터페이스 타입의 배열을 사용
  Tire[] tires = {
      new HankookTire(),
      new HankookTire(),
      new HankookTire(),
      new HankookTire()
  };

  public void run() {
//    frontLeftTire.roll();
//    frontRightTire.roll();
//    backLeftTire.roll();
//    backRightTire.roll();

    for (int i = 0; i < tires.length; i++) {
      tires[i].roll();
    }
  }
}












