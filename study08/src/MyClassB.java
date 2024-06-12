// 부모인 MyInterface 를 상속받아 구현한 클래스
public class MyClassB implements MyInterface{
//  상속받은 추상 메소드 method1()을 오버라이딩함
  @Override
  public void method1() {
    System.out.println("MyClassB - method1() 호출");
  }

//  상속받은 디폴트 메소드인 method2()를 오버라이딩 없이 사용 가능하지만 오버라이딩하여 MyClassB에 맞도록 수정함
  @Override
  public void method2() {
    System.out.println("MyClassB - method2() 호출");
  }
}












