// DMBCellPhone 클래스 선언, 부모 클래스인 CellPhone 을 상속 받음
public class DMBCellPhone extends CellPhone {
//  필드 선언
//  부모 클래스인 CellPhone의 멤버인 model, color 필드를 상속받음
//  직접 입력하지 않아도 model, color이 상속되어 존재함
  int channel;

//  생성자 선언
  DMBCellPhone(String model, String color, int channel) {
//    CellPhone 클래스에서 상속받은 필드인 model 에 매개변수 model의 값을 대입
    this.model = model;
//    CellPhone 클래스에서 상속받은 필드인 color에 매개변수 color의 값을 대입
    this.color = color;
//    DMBCellPhone 클래스가 자체적으로 가지고 있는 필드인 channel 에 매개변수 channel 의 값을 대입
    this.channel = channel;
  }

//  메소드 선언
//  CellPhone 클래스의 멤버 메소드를 상속받아 powerOn(), powerOff(), bell(), sendVoice(), receviceVoice(), hangUp() 메소드를 사용함
//  DMBCellPhone 클래스 자체적으로 가지고 있는 메소드
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












