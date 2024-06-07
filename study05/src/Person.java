public class Person {
//  final 필드의 데이터를 선언과 동시에 입력했을 경우 생성자에서 데이터 초기화가 불가능함

//  final 필드 선언
  final String nation = "korea"; // 선언과 동시에 데이터 입력
  final String ssn; // final 필드로 선언만 함
  String name; // 일반 필드로 선언

//  생성자 선언
  public Person(String ssn, String name) {
//    생성자 안에서 final 필드를 초기화함
    this.ssn = ssn;
//    일반 필드를 초기화함
    this.name = name;
  }
}












