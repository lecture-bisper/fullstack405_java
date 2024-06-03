public class DiceEx {
  public static void main(String[] args) {
//    Math.random() : 0.0 ~ 0.9 까지의 숫자를 랜덤으로 출력하는 명령어
//    0.0 * 6 = 0, => 0.0 + 1 = 1.0, int 타입으로 강제 타입 변환 1, 최소값이 1이 됨
//    0.9 * 6 = 5.4 => 5.4 + 1 = 6.4, int 타입으로 강제 타입 변환 6, 최대값이 6이 됨
    int num = (int)(Math.random() * 6) + 1;

    if (num == 1) {
      System.out.println("1번이 나왔습니다.");
    }
    else if (num == 2) {
      System.out.println("2번이 나왔습니다.");
    }
    else if (num == 3) {
      System.out.println("3번이 나왔습니다.");
    }
    else if (num == 4) {
      System.out.println("4번이 나왔습니다.");
    }
    else if (num == 5) {
      System.out.println("5번이 나왔습니다.");
    }
    else {
      System.out.println("6번이 나왔습니다.");
    }

  }
}












