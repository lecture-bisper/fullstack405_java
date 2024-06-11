public class ChildEx {
  public static void main(String[] args) {
//    부모 클래스 타입의 객체 생성
    Parent parent = new Parent();
//    부모 객체의 인스턴스 멤버 사용
//    부모 객체가 가지고 있던 내용을 출력
    parent.method1();
    parent.method2();

    System.out.println();

//    자식 클래스 타입의 객체 생성
    Child child = new Child();
//    자식 객체의 인스턴스 멤버 사용
//    자식 객체가 가지고 있던 내용을 출력
    child.method1(); // 부모인 Parent 클래스에서 상속받은 method1()을 그대로 사용
    child.method2(); // 부모인 Parent 클래스에서 상속받은 method2()를 오버라이딩하여 내용을 수정 후 사용
    child.method3(); // 자식 클래스인 Child 클래스 전용인 method3()을 사용

    System.out.println();

//    다형성의 효과
//    부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입
//    부모 클래스 타입의 변수명으로 자식 클래스 타입의 멤버를 호출할 수 있음
//    부모 클래스 타입의 멤버만 사용할 수 있음
//    자식 클래스 타입 전용 멤버는 사용할 수 없음
//    부모 클래스 타입의 변수로 다양한 자식 클래스 타입의 객체를 실행할 수 있음
//    사용자에게 하나의 사용방법을 제공하고, 결과는 여러가지 결과를 얻을 수 있음
    parent = child;
    parent.method1(); // 자식 클래스인 Child 클래스 타입의 객체 멤버인 method1()를 사용
    parent.method2(); // 자식 클래스인 Child 클래스 타입의 객체 멤버인 method2()를 사용
//    parent.method3();
  }
}












