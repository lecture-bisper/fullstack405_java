// 부모 클래인 Calculator 를 상속받아 사용하는 자식 클래스 Computer
public class Computer extends Calculator {

//  오버라이딩 : 부모 클래스에서 상속받은 메소드의 코드블록 내용을 수정하여 자식 클래스 전용 메소드로 사용하는 것을 뜻함
//  선언부의 모양은 부모 클래스에서 상속받은 그대로를 사용해야 함

//  부모 클래스인 Calculator에서 상속받은 메소드 areaCircle()
//  @Override : 오버라이딩된 메소드라는 의미의 어노테이션
//  어노테이션 : 자바 컴파일러에게 특정한 기능이 있다는 것을 알려줘서 컴파일러가 해당하는 기능에 맞게 동작하는지 한번 더 확인하도록 하는 명령어
  @Override
  public double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle() 호출");
    return Math.PI * r * r;
  }
}












