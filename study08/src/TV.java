public class TV implements RemoteControl{

  private int volume;

//  RemoteControl 인터페이스에서 상속받아 오버라이딩하여 사용한 메소드
  @Override
  public void turnOn() {
    System.out.println("TV를 켭니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("TV를 끕니다.");
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
    System.out.println("현재 TV 볼륨 : " + this.volume);
  }
}












