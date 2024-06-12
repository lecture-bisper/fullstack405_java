// 인터페이스 RemoteControl과 Searchable 을 모두 상속받아 사용하는 SmartTV 클래스 선언
// 인터페이스는 클래스가 아니므로 다중 구현이 가능함
// 상속받은 인터페이스의 모든 추상 메소드를 다 구현해야 함
public class SmartTV implements RemoteControl, Searchable {

//  필드
  private int volume;

//  RemoteControl 인터페이스에서 상속받은 추상 메소드를 오버라이딩함
  @Override
  public void turnOn() {
    System.out.println("스마트 TV를 켭니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("스마트 TV를 끕니다.");
  }

  @Override
  public void setVolume(int volume) {
    if (volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
    }
    else if (volume < RemoteControl.MIN_VOLUME) {
      this.volume = RemoteControl.MIN_VOLUME;
    }
    else {
      this.volume = volume;
    }
    System.out.println("현재 스마트 TV 볼륨 : " + this.volume);
  }

//  Searchable 인터페이스에서 상속받은 추상 메소드를 오버라이딩하여 사용
  @Override
  public void search(String url) {
    System.out.println(url + "을 검색합니다.");
  }
}












