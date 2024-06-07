package pack2;

//import pack1.A;
import pack1.B;

public class CEx {
  public static void main(String[] args) {
//    클래스 A는 default 접근제한자를 사용하고 있기 때문에 다른 패키지에서 사용이 불가능함
//    클래스 A의 생성자도 default 접근제한자를 사용하기 때문에 다른 패키지에서 생성자에 접근할 수 없음
//    A a = new A();
//    클래스 A의 필드도 default 접근제한자를 사용하기 때문에 다른 패키지에서 필드에 접근할 수 없음
//    System.out.println(a.field1);
//    클래스 A의 메소드도 default 접근제한자를 사용하기 때문에 다른 패키지에서 메소드에 접근할 수 없음
//    a.method1();

//    클래스 B는 클래스와 생성자, 필드, 메소드에 모두 public 접근제한자를 사용하여 아무런 제한없이 사용할 수 있음
    B b = new B();
    System.out.println(b.field2);
    b.method2();

//    클래스 D는 public 접근제한자를 사용하여 외부에서 사용 가능
    D d = new D();
//    클래스 D의 필드인 field4는 private 접근제한자를 사용하여 외부에서 접근불가
//    System.out.println(d.field4);
//    클래스 D의 메소드 method4()는 private 접근제한자를 사용하여 외부에서 접근불가
//    d.method4();
//    클래스 D의 메소드 print()는 default 접근제한자를 사용하여 동일 패키지일 경우 외부에서 사용 가능
//    print() 메소드는 클래스 D의 멤버이므로 동일한 멤버인 field4, method4()를 사용할 수 있음
    d.print();
  }
}












