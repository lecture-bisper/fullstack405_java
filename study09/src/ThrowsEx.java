import java.util.Scanner;

public class ThrowsEx {
  public static void divide(String a, String b) throws ArithmeticException {
    int num1 = Integer.parseInt(a);
    int num2 = Integer.parseInt(b);
    int result = num1 / num2;
    System.out.println("두 수의 나눗셈 결과는 " + result + " 입니다.");
//    try {
//      int num1 = Integer.parseInt(a);
//      int num2 = Integer.parseInt(b);
//      int result = num1 / num2;
//      System.out.println("두 수의 나눗셈 결과는 " + result + " 입니다.");
//    }
//    catch (ArithmeticException e) {
//      System.out.println("예외 발생 : " + e.getMessage());
//      e.printStackTrace();
//    }
  }

  public static void StringPrint() throws NullPointerException {
    String str = null;
    System.out.println(str.toUpperCase());
  }

  public static void main(String[] args) {
//    throws : 예외 떠 넘기기
//    메소드의 매개변수와 코드 블록 사이에 입력하여 해당 메소드를 호출하는 곳에서 예외처리를 대신 하도록 예외를 전달함
//    떠넘길 예외가 여러개일 경우 , 를 사용하여 여러개의 예외를 나열할 수 있음
//    실제 예외가 발생하는 메소드는 소스코드가 간략해짐
//    예외가 발생하는 메소드를 호출하는 곳에서 대신 예외처리를 하기 때문에 한곳에서 예외를 관리할 수 있음

//    throw : 예외를 강제로 발생 시키기
//    new 키워드와 예외 클래스를 사용하여 지정한 예외를 강제로 발생시킴
//    사용자 정의 예외 클래스를 사용 시 주로 사용함
//    사용법 : throw new 예외클래스;
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 숫자를 입력해주세요 : ");
    String num1 = sc.nextLine();
    System.out.print("두번째 숫자를 입력해주세요 : ");
    String num2 = sc.nextLine();

    try {
      divide(num1, num2);
      StringPrint();
      throw new ClassNotFoundException();
    }
    catch (ArithmeticException e) {
      System.out.println("넘겨받은 예외 : " + e.getMessage());
      e.printStackTrace();
    }
    catch (NullPointerException e) {
      System.out.println("null 인데 사용함");
    }
    catch (Exception e) {
      System.out.println("예외 발생");
    }


    System.out.println("\n ----- 프로그램 정상 종료 ----- \n");
  }
}












