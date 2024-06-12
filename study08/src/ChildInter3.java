public interface ChildInter3 extends ParentInter{

//  부모 인터페이스에서 상속받은 디폴트 메소드를 오버라이딩하여 다시 디폴트 메소드로 재선언
//  디폴트 메소드의 내용을 수정하여 자신의 디폴트 메소드로 사용함
  @Override
  public default void method2() {
    System.out.println("ChildInter3 - method2() 호출");
  }

  public void method3();
}
