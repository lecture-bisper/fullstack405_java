public interface ChildInter2 extends ParentInter{

//  ParentInter에서 상속받은 추상메소드 method1() 이 존재

//  ParentInter에서 상속받은 디폴트 메소드를 오버라이딩하여 추상 메소드로 변경
//  자식 클래스에서 method2를 오버라이딩 해야 함
  @Override
  public void method2();

//  ChildInter2 자신의 추상 메소드
  public void method3();
}
