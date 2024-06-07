package pack1;

public class BEx {
  public static void main(String[] args) {
    A a = new A();
//    접근제한자를 default로 사용했지만 동일한 패키지이기 때문에 사용 가능
    System.out.println(a.field1);
    a.method1();

    B b = new B();
//    접근제한자가 public 이기 때문에 제한없이 사용 가능
    System.out.println(b.field2);
    b.method2();
  }
}












