// Parent 클래스를 상속받아 사용하는 Child 클래스
public class Child extends Parent{

//  메소드 2개 제공
//  Parent 클래스에서 상속받은 메소드가 method1(), method2()이 존재함
//  method1()은 상속받은 그대로 사용하기 때문에 추가로 입력할 필요가 없음

//  Parent 클래스에서 상속받은 메소드를 오버라이딩하여 사용함
  @Override
  public void method2() {
    System.out.println("Child - method2() 호출");
  }

//  Child 클래스가 자체적으로 보유하고 있는 메소드
  public void method3() {
    System.out.println("Child - method3() 호출");
  }
}












