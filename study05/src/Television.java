// Television 클래스 선언
public class Television {
//  정적 필드 선언
  static String company = "Samsung"; // 정적 필드 선언과 동시에 데이터 입력
  static String model = "OLED"; // 정적 필드 선언과 동시에 데이터 입력
  static String info; // 정적 필드 선언만 함, 초기화 안함

//  정적 초기화 블록
  static {
//    초기화되지 않은 정적 필드인 info에 데이터를 입력하여 초기화
//  정적 멤버는 정적 멤버만 사용할 수 있음
//  정적 초기화 블록도 정적 멤버임
    info = company + " - " + model;
  }
}












