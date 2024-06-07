// Singleton 클래스 선언
public class Singleton {
  
//  Singleton 클래스 타입의 변수 instance 선언
//  new 키워드로 생성자를 호출하여 Singleton 타입의 객체 생성
//  static 키워드를 사용하여 정적 멤버로 선언 (데이터를 모두 함께 공유, 클래스명을 통해서 접근이 가능함)
//  private 접근 제한자를 사용하여 외부에서 사용 불가능
  private static Singleton instance = new Singleton();

//  private 접근 제한자를 사용하여 외부에서 생성자를 호출 못하도록 막음
  private Singleton() {}

// public 접근 제한자를 사용하여 외부에서 접근 가능
//  static 키워드를 사용하여 정적 멤버로 사용
  public static Singleton getInstance() {
    return instance;
  }
}












