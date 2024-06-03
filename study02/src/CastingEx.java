public class CastingEx {
  public static void main(String[] args) {
//    int 타입의 변수 선언 후 데이터 저장
    int intValue = 44032;
//    char 타입의 변수에 int 타입의 데이터를 강제 타입 변환으로 저장
//    10진수 44032는 16진수로 변환 시 AC00가 되고 AC00는 한글 유니코드표에서 '가'를 뜻함
    char charValue = (char)intValue;
    System.out.println(charValue);

//    long 타입의 변수 선언과 동시에 정수 500을 저장
//    int 타입의 정수 500을 long 타입의 변수 longValue에 자동 타입 변환으로 저장
    long longValue = 500;
//    long 타입의 데이터를 int 타입의 변수에 강제 타입 변환으로 저장
    intValue = (int)longValue;
    System.out.println(intValue);

    double doubleValue = 3.14;
//    double 타입의 데이터를 int 타입의 변수에 강제 타입 변환으로 저장
    intValue = (int) doubleValue;
    System.out.println(intValue);
  }
}
