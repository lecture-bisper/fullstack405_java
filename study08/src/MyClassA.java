public class MyClassA implements MyInterface{

// MyInterface 인터페이스에서 상속받은 추상 메소드 method1()를 오버라이딩함
  @Override
  public void method1() {
    System.out.println("MyClassA - method1() 호출");
  }
  
//  부모인 인터페이스에 디폴트 메소드가 있을 경우 디폴트 메소드는 필요에 따라서 오버라이딩이 가능함
//  상속받은 디폴트 메소드를 오버라이딩 없이 그냥 사용해도 됨
//  상속받은 디폴트 메소드를 오버라이딩하여 자식 클래스의 전용 메소드로 만들어도 됨
}












