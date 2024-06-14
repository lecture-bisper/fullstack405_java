import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {
  public static void main(String[] args) {

//    HashSet 타입의 객체 생성
    Set<String> set = new HashSet();

//    HashSet에 데이터 추가
    set.add("Java");
    set.add("JDBC");
    set.add("Servlet/JSP");
    set.add("Java"); // 이미 저장된 데이터이기 때문에 무시
    set.add("iBatis");

    int size = set.size();
    System.out.println("총 객체 수 : " + size);

//    HashSet에는 index를 기반으로 데이터를 출력하는 메소드가 없음
//    HashSet에 저장된 데이터를 출력하기 위해서 Iterator 타입으로 변환하는 메소드를 제공함
//    Iterator : 반복자, 저장된 내용을 하나씩 모두 출력할 수 있는 데이터 타입
    Iterator<String> iter = set.iterator();

//    hasNext() : Iterator에서 제공하는 메소드로 출력할 데이터가 있는지 확인
//    next() : Iterator에서 제공하는 메소드로 실제로 데이터를 출력
    while (iter.hasNext()) { // 출력할 데이터가 있는지 확인
      String element = iter.next(); // 실제로 데이터 출력
      System.out.println("\t" + element);
    }

//    저장된 데이터 삭제
    set.remove("JDBC");
    set.remove("iBatis");

    System.out.println("총 객체 수 : " + set.size());

//    발전된 for문을 사용하여 HashSet에 저장된 모든 데이터를 출력
    for (String element : set) {
      System.out.println("\t" + element);
    }

//    모든 데이터 삭제
    set.clear();

//    HashSet에 저장된 데이터가 있는지 확인
    if (set.isEmpty()) {
      System.out.println("비어 있음");
    }
  }
}












