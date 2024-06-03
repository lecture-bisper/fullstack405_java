public class OperationEx {
  public static void main(String[] args) {
//    byte 타입의 변수 선언
    byte byteValue1 = 10;
    byte byteValue2 = 20;
//    자바에서 정수 타입의 기본 타입이 int 타입
//    정수 타입의 데이터를 연산 시 int 타입으로 진행함
//    아래의 연산은 결과값이 int 타입이 됨
//    int 타입의 결과값을 byte 타입의 변수에 저장하려고 하기 때문에 오류가 발생함
//    byte byteValue3 = byteValue1 + byteValue2;
//    byte타입의 변수 2개를 연산하여 int 타입의 변수에 저장
//    자동 타입 변환으로 데이터 저장
    int intValue = byteValue1 + byteValue2;
    System.out.println(intValue);

//    char 타입의 변수 선언과 동시에 데이터 저장
    char charValue1 = 'A';
    char charValue2 = 1;
//    char charValue3 = charValue1 + charValue2;
//    char 타입의 변수 2개를 연산하면 int 타입의 결과값이 출력됨
//    int 타입의 변수에 저장
    int intValue2 = charValue1 + charValue2;
    System.out.println("유니코드 : " + intValue2);
//    int 타입의 변수에 저장된 데이터를 강제 타입 변환으로 출력
    System.out.println("출력문자 : " + (char)intValue2);

//    int 타입의 변수 선언과 동시에 데이터 저장
    int intValue3 = 10;
//    intValue3 / 4 를 연산 시 소수점 이하의 데이터는 무시
//    int 타입의 변수에 정수끼리 연산한 값을 저장
    int intValue4 = intValue3 / 4;
    System.out.println(intValue4);

    int intValue5 = 10;
//    연산 시 자동 타입 변환으로 인하여 10 / 4.0이 10.0 / 4.0이 되어 double 타입의 결과값이 출력됨
//    double 타입의 결과값을 int 타입의 변수에 저장하려고 하기 때문에 오류가 발생함
//    int intValue6 = 10 / 4.0;
//    int 타입의 데이터 / double 타입의 데이터로 연산하여 int 타입의 데이터를 double 타입으로 자동 타입 변환 후 연산함
    double doubleValue = intValue5 / 4.0;
    System.out.println(doubleValue);
  }
}










