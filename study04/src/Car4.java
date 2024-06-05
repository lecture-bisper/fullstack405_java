// 클래스 Car4 선언
public class Car4 {

  String carColor = "빨강색";
  int carCC;

//  기본 생성자 : 매개변수가 없는 생성자
//  클래스에 어떤한 생성자도 입력하지 않았을 경우 컴파일러가 자동으로 기본 생성자를 생성하여 추가함, 기본 생성자의 내용은 아무것도 없음
//  개발자가 생성자를 1개라도 입력하면 컴파일러가 기본 생성자를 추가하지 않음
//  기본 생성자와 매개변수가 있는 생성자를 함께 사용하려면 개발자가 기본 생성자와 매개변수가 있는 생성자를 모두 직접 입력해야 함
  
//  기본 생성자
  public Car4() {
    carCC = 1000;
    carColor = "파랑색";
  }
  
//  매개변수가 2개 있는 생성자 선언
  public Car4(String color, int cc) {
    carCC = cc;
    carColor = color;
  }
}












