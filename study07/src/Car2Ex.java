public class Car2Ex {
  public static void main(String[] args) {
//    Car2 클래스 타입의 객체 생성
    Car2 car = new Car2();

//    반복문을 사용하여 5번 반복 실행
    for (int i = 1; i <= 5; i++) {
//      문제가 발생한 위치를 저장하는 변수
      int problemLocation = car.run();

      switch (problemLocation) {
        case 1:
          System.out.println("앞왼쪽 HankookTire로 교체");
          car.frontLeftTire = new HanKookTire("앞왼쪽", 15);
          break;

        case 2:
          System.out.println("앞오른쪽 KumhoTire로 교체");
//          다형성을 사용하여 부모 클래스인 Tire 클래스 타입의 변수 frontRightTire에 자식 클래스 KumhoTire 타입의 객체를 대입
          car.frontRightTire = new KumhoTire("앞오른쪽", 13);
          break;

        case 3:
          System.out.println("뒤왼쪽 HankookTire로 교체");
          car.backLeftTire = new HanKookTire("뒤왼쪽", 14);
          break;

        case 4:
          System.out.println("뒤오른쪽 KumhoTire로 교체");
          car.backRightTire = new KumhoTire("뒤오른쪽", 17);
          break;
      }
      System.out.println("------------------------------------");
    }
  }
}












