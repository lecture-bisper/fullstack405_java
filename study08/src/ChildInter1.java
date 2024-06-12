// 부모 인터페이스를 상속한 자식 인터페이스
public interface ChildInter1 extends ParentInter{

//  상속받은 추상 메소드 method1() 이 존재, 그냥 다시 상속해줌
//  상속받은 디폴트 메소드 method2() 가 존재
  
//  ChildInter1 자신의 추상 메소드
  public void method3();
}
