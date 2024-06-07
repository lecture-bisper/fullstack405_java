public class CalculatorEx {
  public static void main(String[] args) {
    System.out.println("----- 정적 멤버를 사용하여 연산 -----");
//    정적 멤버를 사용하여 Calculator 클래스 타입의 객체가 없음
    double result1 = 10 * 10 * Calculator.pi;
    int result2 = Calculator.plus(10, 5);
    int result3 = Calculator.minus(10, 5);

    System.out.println("result1 : " + result1);
    System.out.println("result2 : " + result2);
    System.out.println("result3 : " + result3);

    System.out.println("----- 기존 방식으로 연산 -----");
//    Calculator 클래스 타입의 객체를 생성하고 인스턴스 멤버를 통해서 연산
//    정적 멤버를 객체를 통해서 접근하는 방식은 권장되지 않는 방법
    Calculator cal = new Calculator();
    result1 = 10 * 10 * cal.pi;
    result2 = cal.plus(10, 5);
    result3 = cal.minus(10, 5);

    System.out.println("result1 : " + result1);
    System.out.println("result2 : " + result2);
    System.out.println("result3 : " + result3);

    System.out.println("\n---------------------------\n");

    Calculator2 cal1 = new Calculator2();
    Calculator2 cal2 = new Calculator2();

    cal1.num1 = 10;
    cal1.num2 = 20;
    System.out.println("cal1의 두 수의 덧셈은 : " + (cal1.num1 + cal1.num2));

    cal2.num1 = 100;
    cal2.num2 = 200;
    System.out.println("cal2의 두 수의 덧셈은 : " + (cal2.num1 + cal2.num2));

    cal1.staticNum1 = 10;
    cal1.staticNum2 = 20;
    System.out.println("cal1의 static 두 수의 덧셈은 : " + (cal1.staticNum1 + cal1.staticNum2));

    cal2.staticNum1 = 100;
    cal2.staticNum2 = 200;
    System.out.println("cal2의 static 두 수의 덧셈은 : " + (cal2.staticNum1 + cal2.staticNum2));

    System.out.println();

    cal1.num1 = 100;
    cal1.num2 = 200;
    cal2.num1 = 1000;
    cal2.num2 = 2000;
    System.out.println("cal1의 두 수의 덧셈은 : " + (cal1.num1 + cal1.num2));
    System.out.println("cal2의 두 수의 덧셈은 : " + (cal2.num1 + cal2.num2));

    cal1.staticNum1 = 100;
    cal1.staticNum2 = 200;
    cal2.staticNum1 = 1000;
    cal2.staticNum2 = 2000;
    System.out.println("cal1의 static 두 수의 덧셈은 : " + (cal1.staticNum1 + cal1.staticNum2));
    System.out.println("cal2의 static 두 수의 덧셈은 : " + (cal2.staticNum1 + cal2.staticNum2));

    System.out.println();

    cal1.staticNum1 = 10;
    cal1.staticNum2 = 20;
    cal2.staticNum1 = 1000;
    cal2.staticNum2 = 2000;
    Calculator2.staticNum1 = 10000;
    Calculator2.staticNum2 = 20000;
    System.out.println("cal1의 static 두 수의 덧셈은 : " + (cal1.staticNum1 + cal1.staticNum2));
    System.out.println("cal2의 static 두 수의 덧셈은 : " + (cal2.staticNum1 + cal2.staticNum2));
    System.out.println("Calculator2의 static 두 수의 덧셈은 : " + (Calculator2.staticNum1 + Calculator2.staticNum2));

  }
}












