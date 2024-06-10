// 상속없이 동일한 기능 만들기
public class DMBCellPhone2 {
//  필드
  String model;
  String color;
  int channel;

//  생성자
  public DMBCellPhone2(String model, String color, int channel) {
    this.model = model;
    this.color = color;
    this.channel = channel;
  }

//  메소드
  void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  void powerOff() {
    System.out.println("전원을 끕니다.");
  }

  void bell() {
    System.out.println("전화벨이 울립니다.");
  }

  void sendVoice(String msg) {
    System.out.println("나 : " + msg);
  }

  void receiveVoice(String msg) {
    System.out.println("상대방 : " + msg);
  }

  void hangUp() {
    System.out.println("전화를 끊습니다.");
  }

  void turnOnDmb() {
    System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
  }

  void changeChannelDmb(int channel) {
    this.channel = channel;
    System.out.println("채널 " + this.channel + "번으로 채널을 변경합니다.");
  }

  void turnOffDmb() {
    System.out.println("DMB 방송 수신을 종료합니다.");
  }
}












