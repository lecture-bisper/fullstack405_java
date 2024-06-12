public class RemoteControlEx {
  public static void main(String[] args) {

//    인터페이스 RemoteControl 타입의 변수 선언
//    인터페이스는 객체를 생성할 수 없음, 해당 인터페이스를 상속받아 구현하는 클래스가 객체를 생성할 수 있음
//    해당 인터페이스를 상속받아 구현하는 클래스에 사용 방법만 제공함
//    다형성을 이용하여 부모인 인터페이스 타입의 변수에 자식 클래스 타입의 객체를 저장하여 사용함
    RemoteControl rc = null;
    rc = new TV();
    rc.turnOn();
    rc.setVolume(5);
    rc.setMute(true);
    rc.turnOff();

    rc = new Audio();
    rc.turnOn();
    rc.setMute(true);
    rc.setVolume(3);
    rc.setMute(false);
    rc.turnOff();
  }
}












