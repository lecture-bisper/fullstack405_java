package pack1;

public class B {
  public void method() {
//    A 클래스의 멤버가 protected 접근제한자를 사용하고 있지만 A 클래스와 B 클래스는 같은 패키지에 속해 있기 때문에 사용 제한이 없음
    A a = new A();
    a.field = "같은 패키지에서 필드 사용";
    a.method();
  }
}












