// CellPhone 클래스 선언, 부모 클래스로 사용됨
public class CellPhone {
//  필드 선언
  String model;
  String color;

//  생성자
//  사용자가 직접 입력한 생성자가 없으므로 컴파일러가 기본 생성자를 추가함
  
//  메소드 선언
  public void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  public void powerOff() {
    System.out.println("전원을 끕니다.");
  }

  public void bell() {
    System.out.println("전화벨이 울립니다.");
  }

  public void sendVoice(String msg) {
    System.out.println("나 : " + msg);
  }

  public void receiveVoice(String msg) {
    System.out.println("상대방 : " + msg);
  }

  public void hangUp() {
    System.out.println("전화를 끊습니다.");
  }
}












