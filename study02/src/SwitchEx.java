public class SwitchEx {
  public static void main(String[] args) {
    int num = (int)(Math.random() * 6) + 1;

    switch (num) {
      case 1:
        System.out.println("1이 나왔습니다.");
        break;

      case 2:
        System.out.println("2가 나왔습니다.");
        break;

      case 3:
        System.out.println("3이 나왔습니다.");
        break;

      case 4:
        System.out.println("4가 나왔습니다.");
        break;

      case 5:
        System.out.println("5가 나왔습니다.");
        break;

      default:
        System.out.println("6이 나왔습니다.");
        break;
    }
  }
}












