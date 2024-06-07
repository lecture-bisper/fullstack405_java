import pack2.C;

public class Car2Ex {
  public static void main(String[] args) {
    Car2 myCar = new Car2();

    myCar.setSpeed(-50);
    System.out.println("현재 속도 : " + myCar.getSpeed());

    myCar.setSpeed(50);
    System.out.println("현재 속도 : " + myCar.getSpeed());

    if (!myCar.isStop()) {
      myCar.setStop(true);
    }

    System.out.println("현재 속도 : " + myCar.getSpeed());
  }
}












