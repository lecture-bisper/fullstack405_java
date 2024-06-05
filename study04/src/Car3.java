// Car3 클래스 선언
public class Car3 {
//  필드 선언
  int gas;

//  메소드 선언, 매개변수가 있음
  void setGas(int gas) {
    this.gas = gas;
  }

  boolean isLeftGas() {
    if (gas == 0) {
      System.out.println("gas가 없습니다.");
      return false;
    }

    System.out.println("gas가 있습니다.");
    return true;
  }

  void run() {
    while (true) {
      if (gas > 0) {
        System.out.println("달립니다. (gas 잔량 : " + gas + "L)");
        gas -= 1;
      }
      else {
        System.out.println("멈춥니다. (gas 잔량 : " + gas + "L)");
        return;
      }
    }
  }
}












