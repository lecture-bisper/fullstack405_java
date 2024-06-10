public class ComputerEx {
  public static void main(String[] args) {
    int r = 10;

    Calculator calc = new Calculator();
    System.out.println("원 면적 : " + calc.areaCircle(r));

    System.out.println();

    Computer computer = new Computer();
    System.out.println("원 면적 : " + computer.areaCircle(r));
  }
}












