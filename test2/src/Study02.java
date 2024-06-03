public class Study02 {
  public static void main(String[] args) {
    int var1 = 10;
    System.out.println("main 메소드에서 선언한 var1 : " + var1);

    System.out.println("-------------------");
    if (true) {
      int var2 = 20;
      System.out.println("if문 에서 선언한 var2 : " + var2);
      System.out.println("if문에서 var1 호출 : " + var1);
//      System.out.println("if문에서 var3 호출 : " + var3);
    }

    System.out.println("-------------------");
    for (int i = 0; i < 1; i++) {
      int var3 = 30;
      System.out.println("for문 에서 선언한 var3 : " + var3);
      System.out.println("for문에서 var1 호출 : " + var1);
//      System.out.println("for문에서 var2 호출 : " + var2);
    }

//    var2는 if 안에서 선언한 변수이므로 if문을 벗어나면 삭제됨 
//    System.out.println("main에서 var2 호출 : " + var2);
//    var3은 for 안에서 선언한 변수이므로 for문 벗어나면 삭제됨
//    System.out.println("main에서 var3 호출 : " + var3);
    
    byte byteValue = 10;
//    byte 타입보다 int 타입이 더 큰 데이터 타입이므로 자동 타입 변환 발생
    int intValue = byteValue;
    System.out.println(intValue);

    char charValue = 'A';
    System.out.println(charValue);
//    자바에서 정수 타입의 기본 데이터 타입은 int 타입
//    작은 정수 타입의 연산이 발생 시 정수 타입으로 자동 변환되어서 연산됨
//    연산된 결과가 int 타입이므로 char 타입의 변수에 저장할 수 없어서 강제 타입 변환을 통해서 데이터를 저장함
    charValue = (char)(charValue + 1);
    System.out.println(charValue);
    intValue = charValue + 1;
    System.out.println("A의 유니코드 : " + intValue);

    intValue = 500;
//    변수 longValue는 long 타입의 변수이므로 int 타입 데이터를 자동 타입 변환하여 저장함
    long longValue = intValue;
    System.out.println(longValue);

    intValue = 200;
//    변수 doubleValue는 double 타입의 변수이므로 int 타입 데이터를 자동 타입 변환하여 저장함
    double doubleValue = intValue;
    System.out.println(doubleValue);
  }
}








