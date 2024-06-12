public class Vehicle2Ex {
  public static void main(String[] args) {

//    부모 인터페이스 타입의 변수에 자식 클래스 타입의 객체 대입
    Vehicle2 vehicle2 = new Bus2();

//    부모 인터페이스에서 제공하는 멤버만 사용이 가능
    vehicle2.run();
//    부모 인터페이스에서 제공하지 않는 멤버인 checkFare()를 호출하여 오류
//    vehicle2.checkFare();

//    원본이 자식 클래스 타입의 객체인 부모 타입 변수 vehicle2를 강제 타입 변환을 통해서 다시 자식 클래스 타입으로 변환
    Bus2 bus2 = (Bus2)vehicle2;

    bus2.run();
    bus2.checkFare(); // Bus2 클래스 전용의 메소드를 다시 사용할 수 있음


    System.out.println();

    Driver2 d2 = new Driver2();

    Bus2 b2 = new Bus2();
    Taxi2 t2 = new Taxi2();

    d2.drive(b2);
    d2.drive(t2);
  }
}












