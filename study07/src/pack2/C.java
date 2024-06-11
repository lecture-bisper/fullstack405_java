package pack2;

import pack1.A;

public class C {
  public void method() {
//    A 클래스에는 public 접근제한자를 사용하고 있어서 A 클래스 타입의 변수를 생성하는 것은 문제가 없음
    A a1;
//    A 클래스의 멤버에 모두 protected 접근제한자를 사용하고 있어서 다른 패키지에 있는 C 클래스에서 A 클래스의 멤버를 사용할 수 없음
//    A a = new A();
//    a.field = "다른 패키지에서 사용";
//    a.method();
  }
}












