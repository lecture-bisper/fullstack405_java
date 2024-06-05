public class Calculator2 {

//  멤버 메소드
  int plus(int x, int y) {
    int result = x + y;
    return result;
  }

//  멤버 메소드
  double avg(int x, int y) {
//    같은 Calculator2 클래스의 멤버인 plus()를 호출, 메소드명만 사용하여 호출
    double sum = plus(x, y);
    double result = sum / 2;
    return result;
  }

//  멤버 메소드
  void execute() {
//    같은 Calculator2 클래스의 멤버인 avg() 를 호출하는데 객체명을 사용하지 않음
    double result = avg(7, 10);
    println("실행결과 : " + result);
  }

//  멤버 메소드
  void println(String message) {
    System.out.println(message);
  }
}












