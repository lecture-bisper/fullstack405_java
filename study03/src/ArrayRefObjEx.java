public class ArrayRefObjEx {
  public static void main(String[] args) {
//    객체를 참조하는 배열, 배열 선언 시 데이터 타입을 참조 타입을 설정한 배열
//    배열을 선언만 함
    String[] strArr = new String[3];

//    기본값으로 초기화된 배열의 내용 출력
    for (int i = 0; i < strArr.length; i++) {
      System.out.println("strArr[" + i + "] : " + strArr[i]);
    }

//    기본 타입처럼 String 데이터를 입력
    strArr[0] = "Java";
    strArr[1] = "Java";
//    new 키워드를 사용하여 데이터 입력
    strArr[2] = new String("Java");

    System.out.println("데이터 입력 후 \n");

    for (int i = 0; i < strArr.length; i++) {
      System.out.println("strArr[" + i + "] : " + strArr[i]);
    }

//    주소를 비교
    System.out.println(strArr[0] == strArr[1]);
    System.out.println(strArr[0] == strArr[2]);
//    문자열을 비교
    System.out.println(strArr[0].equals(strArr[2]));
  }
}












