public class Car2Ex {
  public static void main(String[] args) {
    Car2 car2 = new Car2();

//    car2의 필드 speed에 60 저장
    car2.speed = 60;
    System.out.println("car2의 속도 : " + car2.speed);

    Car2 car21 = new Car2();
//    car21의 필드 speed에 50 저장
    car21.speed = 50;
    System.out.println("car21의 속도 : " + car21.speed);
    
//    car2의 필드 speed나, car21의 필드 speed는 사용하려는 이름이 동일하므로 두 객체의 필드를 구분하기 위해서 앞에 객체명을 반드시 붙여야 함
  }
}












