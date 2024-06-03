public class BreakContinueEx {
  public static void main(String[] args) {
    System.out.println("\n ----- break ----- \n");

//    while문의 조건식에 true를 입력하여 무한 반복
    while (true) {
//      1 ~ 6까지의 정수 중 하나를 랜덤으로 출력
      int num = (int)(Math.random() * 6) + 1;
      System.out.println("랜덤 숫자 : " + num);

//      출력된 랜덤 숫자가 6과 같으면 break; 실행
      if (num == 6) {
        System.out.println("반복문 종료!!");
        break;
      }
    }

    System.out.println("\n ----- continue ----- \n");

    int num = (int) (Math.random() * 10) + 1;
    System.out.println("선택된 숫자 : " + num);

    for (int i = 0; i < 10; i++) {
      if (i == num) {
        continue;
      }
      System.out.println("i 의 값은 : " + i);
    }
  }
}












