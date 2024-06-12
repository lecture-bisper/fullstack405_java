// 추상 클래스로 선언된 Phone 클래스
// abstract 키워드를 클래스에 사용 시 추상 클래스로 선언됨
public abstract class Phone {

//  추상클래스 : class 키워드 앞에 abstract 키워드를 사용한 클래스, 추상 메소드를 가지고 있는 클래스
//  추상 클래스는 객체 생성이 불가능함
//  추상 클래스를 상속받아 자식 클래스를 통해서 객체를 생성하여 사용해야 함
//  추상 클래스는 다른 클래스들의 부모 클래스로 사용함
//  추상 클래스에서 필드와 메소드 이름을 미리 지정하여 자식 클래스들에서 규격을 지키도록 강제함
  
//  필드
  public String owner;

//  생성자
  public Phone(String owner) {
    this.owner = owner;
  }

//  메소드
  public void turnOn() {
    System.out.println("폰 전원을 켭니다.");
  }

  public void turnOff() {
    System.out.println("폰 전원을 끕니다.");
  }
}












