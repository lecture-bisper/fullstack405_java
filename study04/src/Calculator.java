public class Calculator {
  void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  void powerOff() {
    System.out.println("전원을 끕니다.");
  }

  int plus(int x, int y) {
    int result = x + y;
    return result;
  }

//  매개변수로 int 타입의 데이터 2개를 받음
  double divide(int x, int y) {
//    자동 타입 변환에 의해서 int 타입의 데이터가 double 타입의 데이터로 변환
    double result = x / y;
    return result;
  }
}












