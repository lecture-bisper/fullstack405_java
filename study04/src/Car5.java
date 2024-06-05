public class Car5 {

//  필드
//  초기값을 설정한 필드
  String company = "현대 자동차";
//  초기값이 없는 필드
  String model;
  String color;
  int maxSpeed;

//  기본 생성자, 코드 블록에 내용 없음
  public Car5() {
  }

//  매개변수가 1개인 생성자, 필드에 매개변수로 받은 데이터로 초기화
  public Car5(String model) {
    this.model = model;
  }

//  매개변수가 2개인 생성자
  public Car5(String model, String color) {
    this.model = model;
    this.color = color;
  }

//  매개변수가 3개인 생성자
  public Car5(String mo, String color, int maxSpeed) {
//    this : 객체 자신을 의미하는 키워드
//    클래스 내부에서는 필드 혹은 메소드에 접근 시 this.필드명, this.메소드명 으로 접근
//    어짜피 클래스 내부에서 사용하는 것이기 때문에 this 를 생략해도 상관없음
//    this 반드시 써야할 경우는 생성자나 메소드의 매개변수 이름과 클래스의 필드명이 동일할 경우 어떤 것이 매개변수이고 어떤 것이 필드인지 구분하기 위해서 this를 사용함
    model = mo;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}












