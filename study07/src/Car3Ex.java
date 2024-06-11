public class Car3Ex {
  public static void main(String[] args) {
    Car3 car = new Car3();

    for (int i = 1; i <= 5; i++) {
      int problemLocation = car.run();

      if (problemLocation != 0) {
        System.out.println(car.tires[problemLocation - 1].location + " HankookTire로 교체");
        car.tires[problemLocation - 1] = new HanKookTire(car.tires[problemLocation - 1].location, 15);
      }
      System.out.println("---------------------------");
    }
  }
}












