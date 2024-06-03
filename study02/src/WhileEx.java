import java.io.IOException;
import java.util.Scanner;

public class WhileEx {
  public static void main(String[] args) {
    System.out.println("\n ----- 기본 while ----- \n");

    int i = 1;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }

    System.out.println("\n ----- 1 ~ 100까지의 합 ----- \n");

    int sum = 0;
    int j = 1;
    while (j <= 100) {
      sum += j;
      j++;
    }

    System.out.println("1 ~ 100의 총합 : " + sum);
    
    boolean run = true; // 프로그램 실행 상태를 저장하는 변수
    int speed = 0; // 일반 변수
    int keyCode = 0; // 사용자가 입력한 키보드의 키값을 저장하는 변수

//    프로그램 실행 상태를 저장하는 변수인 run의 값이 true 이므로 while문은 무한 반복함
//    무한 반복하여 메뉴를 계속 출력하고 있음
    while (run) {
      if (keyCode != 13 && keyCode != 10) {
        System.out.println("------------------------");
        System.out.println("1. 증속 | 2. 감속 | 3. 중지");
        System.out.println("------------------------");
        System.out.println("선택 : ");
      }

//      자바가 아닌 외부 리소스 사용 시 오류가 발생할 수 있으므로 예외처리를 로직을 추가함
      try {
//        사용자의 키보드 입력을 받음
        keyCode = System.in.read();

//        else if 문으로 사용자가 입력한 키보드 값을 확인
        if (keyCode == 49) {
          speed++;
          System.out.println("현재 속도 : " + speed);
        }
        else if (keyCode == 50) {
          speed--;
          System.out.println("현재 속도 : " + speed);
        }
        else if (keyCode == 51) {
//          무한 반복 중인 while문의 조건식의 값을 false로 변경하여 while문을 탈출
          run = false;
        }
      }
      catch (IOException e) {
        System.out.println("잘못된 입력입니다.\n다시 입력해주세요");
      }
    }
    System.out.println("----- 프로그램 종료 -----");

    System.out.println("\n ----- do ~ while ----- \n");

    System.out.println("메시지를 입력하세요.");
    System.out.println("프로그램을 종료하려면 q를 입력하세요");

//    Scanner - 키보드 입력을 위해 사용하는 클래스
    Scanner sc = new Scanner(System.in);
    String inputString; // 사용자가 입력한 내용을 저장할 변수

    do {
      System.out.print(" >> ");
//      next() : 키보드 입력을 문자열 데이터로 가져옴, 공백을 기준으로 하여 데이터를 구분함
//      nextLine() : 키보드 입력 중 하나의 라인을 모두 가져옴, "\n" 기준으로 하나의 라인으로 인식함, 문자열 데이터로 가져옴
//      nextInt() : 키보드 입력을 정수 데이터로 가져옴
//      nextDouble() : 키보드 입력을 실수 데이터로 가져옴
      inputString = sc.nextLine();
      System.out.println(" - " + inputString);
    } while (!inputString.equals("q"));

    System.out.println();
    System.out.println("프로그램 종료");
  }
}












