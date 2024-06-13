import java.lang.reflect.Array;
import java.util.Scanner;

public class TryCatchFinallyEx {
  public static void main(String[] args) {
//    finally : try ~ catch 예외처리 사용 시 예외가 발생하거나 발생하지 않거나 무조건 실행되어야 하는 소스코드를 입력하는 블록
//    주로 외부 리소스를 메모리에서 삭제하는 코드를 입력 시 사용

    Scanner sc = new Scanner(System.in);
    int[] arrNums = {10, 20, 30, 40, 50};
    System.out.print("출력할 개수를 입력하세요 : ");
    int count = sc.nextInt();

    try {
      for (int i = 0; i < count; i++) {
        System.out.println("arrNums[" + i + "] : " + arrNums[i]);
      }

      System.out.println("--- 정상 실행 시에만 출력 ---");
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 최대 범위를 벗어났습니다.");
    }
    finally {
      System.out.println("--- 예외처리 유무와 관계없이 무조건 실행 ---");
    }


    System.out.println("\n ----- 프로그램 정상 종료 ----- \n");
  }
}












