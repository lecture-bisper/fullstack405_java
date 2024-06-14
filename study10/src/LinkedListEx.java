import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
  public static void main(String[] args) {
//    ArrayList와 LinkedList 객체 생성
    List<String> list1 = new ArrayList();
    List<String> list2 = new LinkedList();

    long startTime; // 시작 시간을 저장할 변수
    long endTime; // 종료 시간을 저장할 변수

//    System.nanoTime() : 자바에서 제공하는 시간 관련 메소드
//    ArrayList에 데이터를 저장하기 전 시간
    startTime = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
//      ArrayList의 0 index에 데이터를 계속 추가하여 기존 데이터를 뒤로 밀어냄
      list1.add(0, String.valueOf(i));
    }
//    ArrayList에 데이터 저장 완료 시간
    endTime = System.nanoTime();
    System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + "ns");

//    위에서 진행했던 내용을 동일하게 LinkedList에서 진행
    startTime = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      list2.add(0, String.valueOf(i));
    }

    endTime = System.nanoTime();
    System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + "ns");
  }
}












