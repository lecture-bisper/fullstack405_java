public class BoxEx {
  public static void main(String[] args) {

//    내부적으로 Object 타입을 사용하여 모든 데이터 타입의 데이터를 저장할 수 있음
    Box box = new Box(); // Box 클래스 타입의 객체 생성
    
//    문자열 저장
    box.set("아이유");
//    저장된 문자열을 출력, 원본이 String 타입이기 때문에 강제 타입 변환으로 String 타입으로 변환
    String name = (String)box.get();
    System.out.println("name : " + name);

//    정수 저장, Box 클래스의 필드인 obj가 Object 클래스 타입이기 때문에 모든 데이터 타입을 저장할 수 있음
    box.set(10000);
//    저장된 정수를 출력, 원본이 int 타입이기 때문에 강제 타입 변환을 통해서 int 타입으로 변환
    int won = (int) box.get();
    System.out.println("오늘 용돈 : " + won);

//    Apple 클래스 객체를 저장
    box.set(new Apple());
    Apple apple = (Apple) box.get();
  }
}












