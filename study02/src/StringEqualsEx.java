public class StringEqualsEx {
  public static void main(String[] args) {
//    기본 타입처럼 String 타입을 사용하여 생성한 String 타입 변수
    String strVal1 = "아이유";
    String strVal2 = "아이유";
//    new 키워드를 사용하여 생성한 String 타입 변수
    String strVal3 = new String("아이유");
    String strVal4 = new String("아이유");

    System.out.println("변수 strVal1 : " + strVal1);
    System.out.println("변수 strVal2 : " + strVal2);
    System.out.println("변수 strVal3 : " + strVal3);
    System.out.println("변수 strVal4 : " + strVal4);

//    비교 연산자로 비교, 기본 타입처럼 사용한 String 타입 변수 비교
    if (strVal1 == strVal2) {
      System.out.println("strVal1 과 strVal2 는 참조가 같음");
    }
    else {
      System.out.println("strVal1 과 strVal2 는 참조가 다름");
    }

//    String 타입의 변수에 저장된 데이터끼리 비교 검사
//    equals() : 문자열을 비교하는 명령어
    if (strVal1.equals(strVal2)) {
      System.out.println("strVal1 과 strVal2 는 문자열이 같음");
    }

//    new 키워드를 사용하여 생성한 String 타입의 변수 비교
    if (strVal3 == strVal4) {
      System.out.println("strVal3 과 strVal4 는 참조가 같음");
    }
    else {
      System.out.println("strVal3 과 strVal4 는 참조가 다름");
    }

//    String 타입의 변수에 저장된 데이터끼리 비교 검사
    if (strVal3.equals(strVal4)) {
      System.out.println("strVal3 과 strVal4 는 문자열이 같음");
    }

    if (strVal1 == strVal3) {
      System.out.println("strVal1 과 strVal3 은 참조가 같다.");
    }
    else {
      System.out.println("strVal1 과 strVal3 은 참조가 다르다.");
    }

    if (strVal1.equals(strVal3)) {
      System.out.println("strVal1 과 strVal3 는 문자열이 같음");
    }

//    String 타입 변수 strVal5에 strVal3을 저장, strVal5에 strVal3이 저장하고 있는 주소를 대입
    String strVal5 = strVal3;
    System.out.println("변수 strVal5 : " + strVal5);

    if (strVal3 == strVal5) {
      System.out.println("strVal3 과 strVal5 는 참조가 같다.");
    }
    else {
      System.out.println("strVal3 과 strVal5 는 참조가 다르다.");
    }

    if (strVal3.equals(strVal5)) {
      System.out.println("strVal3 과 strVal5 는 문자열이 같음");
    }
  }
}












