import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayListEx {
  public static void main(String[] args) {
//    ArrayList 정식 사용 방법
    List<String> list1 = new ArrayList<String>();
//    ArrayList 클래스 타입의 객체로 생성
    ArrayList<String> list2 = new ArrayList<String>();
//    자바 버전이 업데이트 되면서 간략하게 생략된 방식
    List<String> list3 = new ArrayList<>();
//    현재 주로 사용하는 방식
    List<String> list4 = new ArrayList();
//    잘 사용하지 않는 방식, 저장된 데이터를 출력 시 강제 타입 변환 필수
    List list5 = new ArrayList();

//    생성된 ArrayList에 데이터 추가
    list1.add("Java");
    list1.add("JDBC");
    list1.add("Servlet/JSP");
    list1.add(2, "Database");
    list1.add("iBatis");

//    저장된 데이터의 개수 출력
    int size = list1.size();
    System.out.println("총 객체 수 : " + size);
    System.out.println();

//    저장된 데이터 중 지정한 index에 있는 데이터 출력
    String skill = list1.get(2);
    System.out.println("2 index : " + skill);
    System.out.println();

    for (int i = 0 ; i < list1.size(); i++) {
      String str = list1.get(i);
      System.out.println(i + " : " + str);
    }
    System.out.println();

//    ArrayList에 저장된 데이터 삭제
    list1.remove(2); // index 번호로 삭제
    list1.remove(2);
    list1.remove("iBatis"); // 지정한 데이터와 같은 값이 있을 경우 삭제

    for (int i = 0; i < list1.size(); i++) {
      String str = list1.get(i);
      System.out.println(i + " : " + str);
    }

    System.out.println("\n ----- asList() -----\n");
//    asList() : 배열을 가지고 ArrayList를 생성하는 명령어
    List<String> list6 = Arrays.asList("아이유", "유인나", "나영석");
    for (String name : list6) {
      System.out.println(name);
    }

    List<Integer> list7 = Arrays.asList(10, 20, 30);
    for (int item : list7) {
      System.out.println(item);
    }

    String[] arr = {"아이유", "유인나", "나영석"};
    List<String> list8 = Arrays.asList(arr);
    for (String item : list8) {
      System.out.println(item);
    }
  }
}












