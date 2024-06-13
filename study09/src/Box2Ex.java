public class Box2Ex {
  public static void main(String[] args) {

//    제네릭 클래스를 사용하여 객체 생성
//    해당 클래스로 객체 생성 시 사용할 데이터 타입을 String 타입으로 지정함
    Box2<String> box1 = new Box2<String>();
//    내부에서 사용하는 데이터 타입이 모두 String 타입으로 지정됨
    box1.set("아이유");
//    저장된 데이터를 출력 시 이미 String 타입으로 지정되어 있기 때문에 타입 변환이 발생하지 않음
    String name = box1.get();
    System.out.println("name : " + name);

//    제네릭 클래스를 사용하여 객체 생성
//    해당 클래스로 객체 생성 시 사용할 데이터 타입을 Integer 타입으로 지정함
    Box2<Integer> box2 = new Box2();
    box2.set(20000);
    int won = box2.get();
    System.out.println("won : " + won);
  }
}












