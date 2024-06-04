import java.util.Scanner;

public class Quiz {

  public static void quiz2() {
    System.out.println("\n문제 2)\n");

//    사용자 키보드 입력을 받기 위해 Scanner 클래스의 객체 생성
    Scanner sc = new Scanner(System.in);

    System.out.println("정수 10개 입력하세요.");

//    입력받은 데이터를 저장할 배열
    int[] arrNumber = new int[10];

//    for문을 사용하여 10번 키보드 입력을 받음
    for (int i = 0; i < arrNumber.length; i++) {
      System.out.print((i + 1) + "번째 입력 >> ");
//      키보드 입력을 정수로 입력받고 지정한 배열의 index에 저장
      arrNumber[i] = sc.nextInt();
    }

    System.out.println();

//    for문을 사용하여 배열의 내용 출력
    for (int i = 0; i < arrNumber.length; i++) {
//      3의 배수인지 아닌지 확인
      if (arrNumber[i] % 3 == 0) {
        System.out.println("3의 배수 : " + arrNumber[i]);
      }
    }
  }

  public static void quiz4() {
    System.out.println("\n문제 4)\n");

//    사용자 키보드 입력 받기 설정
    Scanner sc = new Scanner(System.in);
//    문자의 배열이므로 char 타입의 배열을 선언
    char[] day = new char[]{'일', '월', '화', '수', '목', '금', '토'};

//    while (true) {
//      System.out.print("정수를 입력하세요 >> ");
//      int input = sc.nextInt();
//
//      if (input < 0) {
//        System.out.println("프로그램을 종료합니다.");
//        break;
//      }
//
//      int index = input % 7;
//      System.out.println(day[index]);
//    }


    while (true) {
      System.out.print("정수를 입력하세요 >> ");
      int input = 0;

      try {
        input = sc.nextInt(); // 정수 입력 받기
      }
      catch (Exception e) { // 정수가 아닌 다른 값이 들어오면 오류 처리
        System.out.println("경고! 숫자를 입력하세요");
        sc.next();
        continue; // continue를 만나서 아래의 다른 작업 종료, 다음 루프로 이동
      }

      if (input < 0) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }

//      입력받은 정수를 7로 나눈 후 나온 나머지값을 배열의 index로 사용
      int index = input % 7; // 배열 day의 길이가 7 이므로 day.length를 사용해도 됨
      System.out.println(day[index]); // 위에서 계산한 index로 배열 day를 출력
    }
  }

  public static void quiz6() {
    System.out.println("\n문제 6)\n");

    String[] eng = {"student", "love", "java", "happy", "future"};
    String[] kor = {"학생", "사랑", "자바", "행복한", "미래"};

//    키보드 입력을 받기 위한 Scanner 클래스의 객체 생성
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("영어 단어를 입력하세요 >> ");
      String output = ""; // 마지막에 입력된 내용 출력을 위한 변수
      String input = sc.nextLine(); // 사용자가 입력한 문자열을 저장할 변수

//      입력된 단어가 "exit"인지 확인
      if (input.equals("exit")) {
        System.out.println("종료합니다.");
        break;
      }
      else { // "exit" 가 아니면 for문을 통해서 eng 배열을 확인
        for (int i = 0; i < eng.length; i++) {
//          사용자가 입력한 단어와 배열 eng에 저장된 단어가 같은지 확인
          if (input.equals(eng[i])) {
//            단어가 같을 경우 출력용 변수 output에 배열 kor의 i 번째 index에 있는 단어를 저장함
            output = kor[i];
            break; // 배열 내용 확인을 즉시 멈춤
          }
          else { // 같은 단어가 없을 경우 출력용 변수 output에 빈 문자열을 입력
            output = "";
          }
        }
      }

//      출력용 변수 output의 문자열이 빈 문자열과 같은지 확인
      if (output.equals("")) {
        System.out.println("그런 영어 단어가 없습니다.");
      }
      else {// 출력용 변수 output이 빈 문자열이 아니면 화면에 출력
        System.out.println(output);
        output = "";// output 내용을 빈 문자열로 입력하여 내용을 제거
      }
    }
  }

  public static void quiz8() {
    System.out.println("\n문제 8) \n");

//    사용자 키보드 입력 설정
    Scanner sc = new Scanner(System.in);
//    0 : 가위, 1 : 바위, 2 : 보 로 설정
//    랜덤 숫자로 index를 선택하여 사용하게 함
    String[] com = {"가위", "바위", "보"};

    System.out.println("컴퓨터와 가위, 바위, 보 게임을 합니다.");

    while (true) {
      System.out.print("가위 바위 보! >> ");
      String input = sc.nextLine();

//      1. 그만할지, 계속할지 여부 결정
      if (input.equals("그만")) {
        System.out.println("게임을 종료합니다.");
        break;
      }

//      0 ~ 2까지의 숫자를 랜덤으로 가져옴
      int index = (int)(Math.random() * 3);

//      2. 가위 바위 보 연산
      if (input.equals("가위")) {
        if (com[index].equals("가위")) {
          System.out.println("사용자 : " + input + ", 컴퓨터 : " + com[index] + ", 비겼습니다.");
        }
        else if (com[index].equals("바위")) {
          System.out.println("사용자 : " + input + ", 컴퓨터 : " + com[index] + ", 컴퓨터가 이겼습니다.");
        }
        else {
          System.out.println("사용자 : " + input + ", 컴퓨터 : " + com[index] + ", 사용자가 이겼습니다.");
        }
      }
      else if (input.equals("바위")) {
        if (com[index].equals("가위")) {
          System.out.println("사용자 : " + input + ", 컴퓨터 : " + com[index] + ", 사용자가 이겼습니다.");
        }
        else if (com[index].equals("바위")) {
          System.out.println("사용자 : " + input + ", 컴퓨터 : " + com[index] + ", 비겼습니다.");
        }
        else {
          System.out.println("사용자 : " + input + ", 컴퓨터 : " + com[index] + ", 컴퓨터가 이겼습니다.");
        }
      }
      else if (input.equals("보")) {
        if (com[index].equals("가위")) {
          System.out.println("사용자 : " + input + ", 컴퓨터 : " + com[index] + ", 컴퓨터가 이겼습니다.");
        }
        else if (com[index].equals("바위")) {
          System.out.println("사용자 : " + input + ", 컴퓨터 : " + com[index] + ", 사용자가 이겼습니다.");
        }
        else {
          System.out.println("사용자 : " + input + ", 컴퓨터 : " + com[index] + ", 비겼습니다.");
        }
      }
    }
  }

  public static void main(String[] args) {
//    quiz2();
//    quiz4();
//    quiz6();
    quiz8();
  }
}












