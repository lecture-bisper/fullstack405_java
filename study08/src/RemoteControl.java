// 인터페이스 RemoteControl 선언
public interface RemoteControl {
//  인터페이스의 멤버는 상수, 추상 메소드, 디폴트 메소드, 정적 메소드

//  상수 선언
  public static final int MAX_VOLUME = 10;
  int MIN_VOLUME = 0;

//  추상 메소드 선언
//  인터페이스의 기본 메소드는 추상 메소드임
//  public abstract 키워드를 사용하지 않아도 컴파일러가 자동으로 붙임
  void turnOn();
  abstract void turnOff();
  public abstract void setVolume(int volume);

//  디폴트 메소드
//  자바 8에서 추가된 메소드로 인터페이스에 추가 기능을 사용할 수 있도록 하기 위해서 추가됨
//  일반 메소드와 동일하게 코드 블록이 존재함
//  반드시 default 키워드를 붙어야 함
  public default void setMute(boolean mute) {
    if (mute) {
      System.out.println("무음 처리됩니다.");
    }
    else {
      System.out.println("무음 해제합니다.");
    }
  }

//  정적 메소드
//  자바 8에서 인터페이스에 추가 기능을 제공하기 위해서 추가됨
  public static void changeBattery() {
    System.out.println("건전지를 교환합니다.");
  }
}










