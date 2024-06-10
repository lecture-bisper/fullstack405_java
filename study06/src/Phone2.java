// 기존에 Phone 클래스가 존재하여 Phone2 클래스로 선언
public class Phone2 {
//  사용자 정보를 저장할 필드 선언
  private String name;
  private String tel;

//  객체 생성 시 필드를 초기화할 생성자 선언
  public Phone2(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

//  필드의 데이터를 우회하여 접근하기 위한 getter 선언
  public String getName() {
    return name;
  }

  public String getTel() {
    return tel;
  }
}












