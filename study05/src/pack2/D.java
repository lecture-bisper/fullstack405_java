package pack2;

//private 접근제한자 사용 시 클래스 외부에서 접근할 수 없음
//클래스 내부에서만 동일한 멤버끼리만 사용할 수 있음
public class D {
//  private 접근제한자를 사용한 필드
  private String field4 = "클래스 D의 field4";

//  private 접근제한자를 사용한 메소드
  private void method4() {
    System.out.println("클래스 D의 method4() 호출");
  }

//  default 접근제한자를 사용하여 동일한 패키지에서 사용할 수 있도록 허용
//  같은 멤버이지만 접근제한자가 private인 멤버를 사용하도록 함
  void print() {
    System.out.println("----- 클래스 D의 멤버가 같은 멤버를 사용 -----");
    System.out.println(field4);
    method4();
  }
}












