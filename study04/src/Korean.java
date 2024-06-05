public class Korean {

//  필드 선언과 동시에 초기값 설정
  String nation = "대한민국";
//  필드만 선언, 초기값 없음, 기본값으로 설정됨 (null)
  String name;
  String ssn;

//  기본 생성자
  public Korean() {

  }

//  매개변수가 있는 생성자
  public Korean(String n, String s) {
    name = n;
    ssn = s;
  }

//  필드를 초기화하기 위한 메소드
  public void setData() {
    nation = "한국";
    name = "홍길동";
    ssn = "123456-1234567";
  }
}












