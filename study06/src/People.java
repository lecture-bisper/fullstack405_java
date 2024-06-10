// People 클래스 선언, 부모 클래스로 사용
public class People {
//  필드
  public String name;
  public String ssn;

  public People() {

  }

//  생성자, 매개변수가 있는 생성자
  public People(String name, String ssn) {
//    자식 클래스의 생성자에서 super()를 통해서 부모 클래스의 생성자를 호출하여 전달한 매개변수를 부모 클래스의 필드에 저장함
    this.name = name;
    this.ssn = ssn;
  }
}












