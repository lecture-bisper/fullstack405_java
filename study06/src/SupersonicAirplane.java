public class SupersonicAirplane extends Airplane {

//  상수선언
  public static final int NORMAL = 1;
  public static final int SUPERSONIC = 2;

  public int flyMode = NORMAL;

//  부모 클래스인 Airplane에서 상속받은 메소드 fly()
//  상속받은 메소드를 오버라이딩함
  @Override
  public void fly() {
    if (flyMode == SUPERSONIC) {
      System.out.println("초음속 비행합니다.");
    }
    else {
//      System.out.println("일반 비행합니다.");
//      super.멤버 : 상속받은 부모 클래스의 멤버(필드, 메소드)를 호출하는 명령어
//      super 키워드를 사용하여 부모 클래스에서 상속받은 메소드를 그대로 실행
      super.fly();
    }
  }
}












