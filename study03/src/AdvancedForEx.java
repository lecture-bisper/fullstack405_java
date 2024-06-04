public class AdvancedForEx {
  public static void main(String[] args) {
    int[] scores = {95, 80, 71, 84, 93};

    System.out.println("----- 향상된 for 문으로 연산하기 -----");
    int sum = 0;

    for (int score : scores) {
      sum += score;
    }

    System.out.println("점수 총합 : " + sum);
    double avg = (double) sum / scores.length;
    System.out.println("점수 평균 : " + avg);

    System.out.println("\n ----- 기존 for 문으로 연산하기 ----- \n");
//    int[] scores = {95, 80, 71, 84, 93};
    sum = 0;

    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    System.out.println("점수 총합 : " + sum);
    avg = (double) sum / scores.length;
    System.out.println("점수 평균 : " + avg);
  }
}












