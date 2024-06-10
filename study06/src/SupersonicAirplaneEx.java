public class SupersonicAirplaneEx {
  public static void main(String[] args) {
    SupersonicAirplane sa = new SupersonicAirplane();

//    상속받은 메소드 takeOff() 사용
    sa.takeOff();
//    상속받아 오버라이딩한 메소드 fly() 사용
    sa.fly();
    sa.flyMode = SupersonicAirplane.SUPERSONIC;
    sa.fly();
    sa.flyMode = SupersonicAirplane.NORMAL;
    sa.fly();
//    상속받은 메소드 land() 사용
    sa.land();
  }
}












