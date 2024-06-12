public class SmartPhoneEx {
  public static void main(String[] args) {
//    Phone 클래스는 추상 클래스이므로 객체 생성이 불가능함
//    추상 클래스는 객체 생성이 불가능하지만 추상 클래스 타입의 변수는 선언 가능함
//      Phone phone;
//    Phone p = new Phone("홍길동");
//    p.turnOn();
//    p.turnOff();

//    추상 클래스 Phone 을 상속받아 사용하는 구현 클래스 SmartPhone의 객체 생성
    SmartPhone smartPhone = new SmartPhone("홍길동");
//    상속받은 멤버와 전용 멤버를 모두 사용
    smartPhone.turnOn();
    smartPhone.internetSearch();
    smartPhone.turnOff();
  }
}












