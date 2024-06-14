import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
  public static void main(String[] args) {

//    HashSet 타입의 객체 생성
    Set<Member> set = new HashSet<Member>();

//    HashSet에 데이터 추가
    set.add(new Member("아이유", 30));
    set.add(new Member("아이유", 30));

    System.out.println("총 객체 수 : " + set.size());
  }
}












