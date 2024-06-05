public class Car3Ex {
  public static void main(String[] args) {
//    Car3 클래스 타입의 변수 myCar 선언
//    new 를 사용하여 Car3() 생성자 호출, 객체 생성, 주소 반환
    Car3 myCar = new Car3();

//    메소드인 setGas() 호출, 매개변수로 정수 5 전달
    myCar.setGas(5);

//    메소드인 isLeftGas() 호출, 실행 후 값을 넘겨줌
    boolean gasState = myCar.isLeftGas();

    if (gasState) {
      System.out.println("출발합니다.");
      myCar.run();
    }

    if (myCar.isLeftGas()) {
      System.out.println("gas를 주입할 필요가 없습니다.");
    }
    else {
      System.out.println("gas를 주입하세요");
    }
  }
}












