public class Car6 {
  String company = "현대 자동차";
  //  초기값이 없는 필드
  String model;
  String color;
  int maxSpeed;

//  기본 생성자
  public Car6() {
//    this() : 생성자 안에서 다른 생성자를 호출하는 명령어
//    this()는 생성자 안에서 첫번째 줄에 입력하여 가장 먼저 실행되어야 함
    this("세단");
    System.out.println("asdasd");
  }

  public Car6(String model) {
    this(model, "검정색");
  }

  public Car6(String model, String color) {
    this(model, color, 200);
  }

  public Car6(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}












