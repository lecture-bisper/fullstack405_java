public class ForEx {
  public static void main(String[] args) {
    System.out.println("기본 for 문");

    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    System.out.println("\n ----- 1 ~ 100까지의 합 ----- \n");

//    총합을 저장할 변수 선언
    int sum = 0;
//    1 ~ 100까지 반복 실행
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }

    System.out.println(sum);

    System.out.println("\n ----- float 타입으로 사용 시 ----- \n");
    for (float x = 0.1F; x <= 1.0F; x += 0.1F) {
      System.out.println(x);
    }
  }
}












