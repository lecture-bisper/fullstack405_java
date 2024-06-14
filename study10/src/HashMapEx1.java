import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
  public static void main(String[] args) {

//    HashMap 클래스 타입의 객체 생성
    Map<String, Integer> map = new HashMap<String, Integer>();

//    HashMap에 데이터 추가
    map.put("아이유", 85);
    map.put("유인나", 90);
    map.put("나영석", 80);
    map.put("유재석", 95);
    System.out.println("총 저장 수 : " + map.size());

//    get()을 사용하여 지정한 키에 대응하는 저장된 데이터를 출력
    System.out.println("\t 유인나 : " + map.get("유인나"));
    System.out.println();

//    HashMap에 저장된 모든 키를 Set 타입으로 변환하여 출력, 중복제거를 위해서 Set 타입 사용
    Set<String> keySet = map.keySet();
//    저장된 데이터를 하나씩 출력하는 Iterator 방식으로 출력
    Iterator<String> keyIter = keySet.iterator();

//    while 문을 통해서 Iterator 타입에 저장된 데이터 중 출력할 데이터가 있는지 확인
    while (keyIter.hasNext()) {
//      Iterator 에 저장된 데이터를 실제로 출력, 출력되는 데이터는 모두 Key
      String key = keyIter.next();
//      가져온 Key를 사용하여 Key와 1:1로 매칭된 데이터를 가져옴
      int value = map.get(key);
      System.out.println("\t" + key + " : " + value);
    }
    System.out.println();

//    HashMap 타입에서 데이터 제거
    map.remove("나영석");
    System.out.println("총 저장 수 : " + map.size());

//    HashMap에 저장되어 있는 Map.Entry 타입의 데이터를 모두 가져옴
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//    Set 타입으로 출력된 Map.Entry를 Iterator 타입으로 다시 변환
    Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();

//    출력할 데이터 여부 확인
    while (entryIter.hasNext()) {
//      next()를 사용하여 Map.Entry 타입의 객체를 가져옴
      Map.Entry<String, Integer> entry = entryIter.next();
      String key = entry.getKey(); // Map.Entry 타입에 저장되어 있던 key를 가져옴
      int value = entry.getValue(); // Map.Entry 타입에 저장되어 있는 value를 가져옴
      System.out.println("\t" + key + " : " + value);
    }
    System.out.println();

//    HashMap에 저장된 모든 데이터 삭제
    map.clear();
    System.out.println("총 저장 수 : " + map.size());
  }
}












