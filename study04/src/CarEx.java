public class CarEx {
  public static void main(String[] args) {
//    Car 클래스 타입의 변수 myCar를 선언
//    new 키워드를 사용하여 Car 클래스의 생성자 Car() 호출하여 객체 생성 및 주소를 되돌려줌
    Car myCar = new Car();

//    기본값으로 설정된 데이터를 출력
//    객체 사용 시 '객체명.필드명' 으로 필드의 데이터를 사용
    System.out.println("제작회사 : " + myCar.company);
    System.out.println("모델명 : " + myCar.model);
    System.out.println("색상 : " + myCar.color);
    System.out.println("최고속도 : " + myCar.maxSpeed);
    System.out.println("현재속도 : " + myCar.speed);

//    Car 클래스의 객체인 myCar의 멤버 중 speed 필드에 데이터를 저장
    myCar.speed = 60;
    System.out.println("수정된 현재속도 : " + myCar.speed);
  }
}












