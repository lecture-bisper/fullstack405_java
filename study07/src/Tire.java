// 부모 클래스로 사용되는 Tire 클래스
public class Tire {

//  필드
  public int maxRotation; // 최대 회전수
  public int accRotation; // 누적 회전수
  public String location; // 타이어 위치

//  생성자, 타이어 위치와 최대 회전수를 초기화
  public Tire(String location, int maxRotation) {
    this.location = location;
    this.maxRotation = maxRotation;
  }

//  메소드
  public boolean roll() {
    ++accRotation; // 누적 회전수 증가
    if (accRotation < maxRotation) {
      System.out.println(location + " Tire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("***** " + location + " Tire 펑크 *****");
      return false;
    }
  }
}












