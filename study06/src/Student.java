// People 클래스를 상속받아 사용하는 Student 클래스
public class Student extends People {
//  필드
  public int studentNo;
//  부모 클래스인 People 클래스에서 상속받은 필드 name, ssn 이 존재함
//  부모 클래스의 생성자를 통해서 초기화된 필드를 자식 클래스인 Student가 상속받아 사용함

//  생성자
  public Student(String name, String ssn, int studentNo) {
//    super() : 부모 클래스의 생성자를 호출하는 명령어
//    super(); // 부모 클래스의 생성자 중 기본 생성자가 있을 경우 자식 클래스의 생성자에서 super()를 생략해도 오류가 나지 않음
//    컴파일러가 자동으로 부모 생성자를 호출하는 super()를 추가하기 때문임
//    super()는 반드시 자식 생성자의 첫번째로 실행하도록 해야 함
    super(name, ssn);

    this.studentNo = studentNo;
  }
}












