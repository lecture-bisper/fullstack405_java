// 인터페이스 RemoteControl을 구현하는 Audio 클래스
public class Audio implements RemoteControl{

//  Audio 클래스의 필드
  private int volume;

//  RemoteControl에서 상속받아 오버라이딩한 메소드
  @Override
  public void turnOn() {
    System.out.println("Audio를 켭니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("Audio를 끕니다.");
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
    System.out.println("현재 Audio 볼륨 : " + this.volume);
  }
}












