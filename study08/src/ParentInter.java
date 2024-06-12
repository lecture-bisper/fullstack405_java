public interface ParentInter {
//  추상 메소드, 하위 클래스에서 오버라이딩해서 사용해야 함
  public void method1();
  
//  디폴트 메소드, 필요 시 오버라이딩, 그냥 사용도 상관없음
  public default void method2() {
    System.out.println("ParentInter - method2() 호출");
  }
}
