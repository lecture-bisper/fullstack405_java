public class DMBCellPhoneEx {
  public static void main(String[] args) {
//    DMBCellPhone 클래스 타입의 객체 dmbCellPhone 생성
    DMBCellPhone dmbCellPhone = new DMBCellPhone("자바폰", "검정", 10);

//    dmbCellPhone 객체의 인스턴스 멤버(필드)를 사용
    System.out.println("모델 : " + dmbCellPhone.model);
    System.out.println("색상 : " + dmbCellPhone.color);
    System.out.println("채널 : " + dmbCellPhone.channel);

//    dmbCellPhone 객체의 인스턴스 멤버(메소드)를 사용
    dmbCellPhone.powerOn();
    dmbCellPhone.bell();
    dmbCellPhone.sendVoice("여보세요??");
    dmbCellPhone.receiveVoice("안녕하세요. 홍길동인데요..");
    dmbCellPhone.sendVoice("..... 잘못거셨습니다.");
    dmbCellPhone.hangUp();

    dmbCellPhone.turnOnDmb();
    dmbCellPhone.changeChannelDmb(20);
    dmbCellPhone.turnOffDmb();
    dmbCellPhone.powerOff();


    System.out.println("\n -----------------------------\n");

    DMBCellPhone2 dmbCellPhone2 = new DMBCellPhone2("자바폰", "검정", 10);

    System.out.println("모델 : " + dmbCellPhone2.model);
    System.out.println("색상 : " + dmbCellPhone2.color);
    System.out.println("채널 : " + dmbCellPhone2.channel);

    dmbCellPhone2.powerOn();
    dmbCellPhone2.bell();
    dmbCellPhone2.sendVoice("여보세요??");
    dmbCellPhone2.receiveVoice("안녕하세요. 홍길동인데요..");
    dmbCellPhone2.sendVoice(".... 잘못거셨습니다.");
    dmbCellPhone2.hangUp();

    dmbCellPhone2.turnOnDmb();
    dmbCellPhone2.changeChannelDmb(20);
    dmbCellPhone2.turnOffDmb();
    dmbCellPhone2.powerOff();

  }
}












