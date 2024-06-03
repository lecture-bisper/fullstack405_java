public class IfElseEx {
  public static void main(String[] args) {
    int score = 85;

    if (score >= 90) {
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A입니다.");
    }
    else {
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B입니다.");
    }

    int money = 15000;

    System.out.println("중화 요리점에 갑니다.");

    if (money >= 12000) {
      System.out.println("자장면을 주문합니다.");
      System.out.println("군만두를 추가로 주문합니다.");
    }
    else {
      System.out.println("자장면만 주문합니다.");
    }

    System.out.println("주문한 음식을 맛있게 먹습니다.");
  }
}












