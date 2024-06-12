public class Driver2 {

  public void drive(Vehicle2 v) {
    if (v instanceof Bus2) {
      Bus2 bus2 = (Bus2) v;
      bus2.checkFare();
    }

    v.run();
  }
}












