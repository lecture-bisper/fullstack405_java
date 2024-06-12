public class SmartTVEx {
  public static void main(String[] args) {

//    RemoteControl 인터페이스와 Searchable 인터페이스를 모두 상속받은 구현 클래스 SmartTV의 객체 생성
    SmartTV smartTV = new SmartTV();
//    RemoteControl 인터페이스와 Searchable 인터페이스의 모든 기능을 다 사용함
    smartTV.turnOn();
    smartTV.setVolume(10);
    smartTV.setMute(true);
    smartTV.search("네이버");
    smartTV.turnOff();

    System.out.println("\n ----- 인터페이스를 다중 상속받은 구현 클래스의 객체를 다시 인터페이스 타입의 변수에 대입했을 경우 ----- \n");
//    부모인 Searchable 인터페이스 타입의 변수 선언
//    부모 타입의 변수에 자식 클래스 타입의 객체 대입
//    부모 타입으로 자식 객체의 멤버를 호출할 수 있음
    Searchable s = smartTV;
    s.search("구글");
//    다중 상속을 받은 자식 객체를 부모 타입인 인터페이스 변수에 대입 후 사용하면 해당 인터페이스에서 제공하는 멤버만 사용할 수 있음
//    s.turnOn();

    RemoteControl r = smartTV;
    r.turnOn();
    r.turnOff();
//    r.search("아이유");


    System.out.println("\n----- 정적 메소드와 디폴트 메소드 실행 -----\n");
    
//    인터페이스의 디폴트 메소드 호출
    RemoteControl r2 = new SmartTV();
    r2.setMute(true);
    r2.setMute(false);
//    디폴트 메소드는 인터페이스 이름으로 호출할 수 없음
//    RemoteControl.setMute(true);

//    인터페이스의 정적 메소드 호출
    RemoteControl.changeBattery();
//    부모인 인터페이스 타입의 변수에 자식 클래스 타입의 객체를 대입하고 정적 메소드를 호출 시 오류 발생
//    r2.changeBattery();
    
  }
}












