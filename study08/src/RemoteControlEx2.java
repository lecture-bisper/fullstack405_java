public class RemoteControlEx2 {
  public static void main(String[] args) {

//    RemoteControl 인터페이스 타입의 변수 선언
//    익명 구현 객체를 사용하여 객체를 생성
    RemoteControl rc = new RemoteControl() {

//      익명 구현 객체의 필드, 내부적으로만 사용 가능
      private int volume;

//      RemoteControl 인터페이스가 가지고 있던 추상 메소드를 오버라이딩하여 구현함
      @Override
      public void turnOn() {
        System.out.println("전원을 켭니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("전원을 끕니다.");
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
        System.out.println("현재 볼륨 : " + this.volume);
      }
    }; // 익명 구현 객체 사용 시 닫는 코드 블록에 반드시 ';' 이 있어야 함
    
//    인터페이스 타입의 변수에 자식 클래스 타입의 객체를 대입한 것과 같은 효과
//    클래스의 이름이 없기 때문에 단 한번만 객체 생성이 가능함
    rc.turnOff();
    rc.setVolume(5);
    rc.turnOff();
  }
}












