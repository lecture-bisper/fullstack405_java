import java.util.Scanner;

public class MultiCatchEx2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 숫자를 입력하세요 : ");
    String data1 = sc.nextLine();
    System.out.print("두번째 숫자를 입력하세요 : ");
    String data2 = sc.nextLine();
    System.out.print("배열에서 출력할 개수를 입력하세요 : ");
    int count = sc.nextInt();
    System.out.print("세번째 숫자를 입력해주세요 : ");
    int num1 = sc.nextInt();
    System.out.print("네번째 숫자를 입력해주세요 : ");
    int num2 = sc.nextInt();
    sc.nextLine();

    System.out.println();

    int[] numbers = {10, 20, 30, 40, 50};

    try {
      int value1 = Integer.parseInt(data1);
      int value2 = Integer.parseInt(data2);
      int result = value1 + value2;
      System.out.println(data1 + " + " + data2 + " = " + result);

      System.out.println();

      for (int i = 0; i < count; i++) {
        System.out.println("배열 numbers[" + i + "] = " + numbers[i]);
      }

      System.out.println();

      result = num1 / num2;
      System.out.println(num1 + " / " + num2 + " = " + result);
    }
    catch (NumberFormatException | ArithmeticException e) {
      System.out.println("잘못된 데이터를 입력하였습니다.");
    }
    catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
      System.out.println("사용할 수 없는 데이터를 사용하였습니다.");
    }
    catch (Exception e) {
      System.out.println("예외가 발생했습니다.");
    }

    System.out.println("\n ----- 프로그램 종료 !! ----- \n");
  }
}












