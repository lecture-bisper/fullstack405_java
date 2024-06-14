import java.util.TreeSet;

public class TreeSetEx {
  public static void main(String[] args) {
    
//    TreeSet 객체 생성
    TreeSet<Integer> scores = new TreeSet<Integer>();

    scores.add(87);
    scores.add(98);
    scores.add(75);
    scores.add(95);
    scores.add(80);

    Integer score = null;

//    first() : 이진 트리에서 가장 작은 값을 출력
    score = scores.first();
    System.out.println("가장 낮은 점수 : " + score);

//    last() : 이진 트리에서 가장 큰 값을 출력
    score = scores.last();
    System.out.println("가장 높은 점수 : " + score);

//    lower() : 이진 트리에서 지정한 값보다 작은 값 출력
    score = scores.lower(95);
    System.out.println("95보다 아래 점수 : " + score);

//    higher() : 이진 트리에서 지정한 값보다 큰 값 출력
    score = scores.higher(95);
    System.out.println("95보다 높은 점수 : " + score);

//    floor() : 이진 트리에서 지정한 값이거나 지정한 값보다 작은 값 출력
    score = scores.floor(95);
    System.out.println("95 이거나 바로 아래 점수 : " + score);

//    ceiling() : 이진 트리에서 지정한 값이거나 지정한 값보다 큰 값 출력
    score = scores.ceiling(85);
    System.out.println("85 이거나 바로 위의 점수 : " + score);

//    pollFirst() : 이진 트리에서 지정한 값을 출력
    while (!scores.isEmpty()) {
      score = scores.pollFirst();
      System.out.println(score + "(남은 수 : " + scores.size() + ")");
    }
  }
}












