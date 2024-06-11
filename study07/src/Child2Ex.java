public class Child2Ex {
  public static void main(String[] args) {

//    Parent2 클래스 타입의 변수에 자식 클래스인 Child2 클래스 타입의 객체 대입
//    겉 모양은 Parent2 타입이지만 알맹이는 Child2 클래스 타입의 객체
//    다형성에 의해서 부모 클래스 타입의 변수로 자식 클래스 타입의 멤버를 호출할 수 있음
    Parent2 parent2 = new Child2();
    parent2.field = "데이타 1";
    parent2.method1();
    parent2.method2();

//    부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 저장하여 사용하기 때문에 부모 클래스 타입에서 제공하는 멤버만 사용할 수 있음
//    parent2.field2 = "데이터 2";
//    parent2.method3();

//    부모 클래스 타입의 객체가 만약 원본이 자식 클래스 타입의 객체일 경우 강제 타입 변환을 통해서 자식 클래스 타입으로 변환할 수 있음
    Child2 child2 = (Child2)parent2;
//    기존의 자식 클래스 타입의 멤버를 모두 사용할 수 있음
    child2.field2 = "데이터 2";
    child2.method3();
  }
}












