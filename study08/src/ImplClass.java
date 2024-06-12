// 부모 인터페이스인 InterC를 상속받아 구현한 ImplClass
public class ImplClass implements InterC{

//  InterC 에서 상속받은 추상 메소드 methodA(), methodB(), methodC() 를 모두 오버라이딩하여 구현해야 함
  @Override
  public void methodA() {
    System.out.println("ImplClass - methodA() 호출");
  }

  @Override
  public void methodB() {
    System.out.println("ImplClass - methodB() 호출");
  }

  @Override
  public void methodC() {
    System.out.println("ImplClass - methodC() 호출");
  }
}












