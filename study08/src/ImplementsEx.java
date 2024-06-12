public class ImplementsEx {
  public static void main(String[] args) {

    System.out.println("\n----- 구현 클래스로 실행 -----\n");
    ImplClass impl = new ImplClass();
    impl.methodA();
    impl.methodB();
    impl.methodC();

    System.out.println("\n----- InterA 타입으로 실행 -----\n");
//    InterA 인터페이스는 상속 계층에 존재하므로 InterA 타입의 변수에 자식 클래스의 객체를 대입할 수 있음
//    InterA가 제공하는 멤버만 사용 가능
    InterA ia = impl;
    ia.methodA();

    System.out.println("\n----- InterB 타입으로 실행 -----\n");
    InterB ib = impl;
    ib.methodB();

    System.out.println("\n----- InterC 타입으로 실행 -----\n");
//    InterC 인터페이스 타입의 변수에 자식 클래스 타입의 객체를 대입하여 사용 시 InterC가 InterA와 InterB를 다중 상속받아 사용하고 있으므로 모든 멤버를 사용할 수 있음
    InterC ic = impl;
    ic.methodA();
    ic.methodB();
    ic.methodC();

  }
}












