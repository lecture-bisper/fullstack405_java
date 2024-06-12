public class DriverEx {
  public static void main(String[] args) {

    Bus bus = new Bus();
    bus.run();
    Taxi taxi = new Taxi();
    taxi.run();

    System.out.println();

    Driver d = new Driver();
    d.drive(bus);
    d.drive(taxi);
  }
}












