public class MainArgument {
  public static void main(String[] args) {
    
//    args의 길이가 2와 같지 않으면 프로그램 사용법 출력 후 종료
    if (args.length != 2) {
      System.out.println("----- program use -----");
      System.out.println("java MainArgument num1 num2");
//      System.exit(0) : 프로그램 즉시 종료
      System.exit(0);
    }

    String strNum1 = args[0];
    String strNum2 = args[1];
//    입력받은 문자를 숫자로 변환
//    Integer : int 데이터 타입의 랩핑 클래스, 기본 데이터 타입은 데이터만 표시하기 위한 데이터 타입이기 때문에 기능이 없음, 기본 데이터 타입에 추가 기능을 제공하기 위해서 사용하는 클래스
//    parseInt(문자열) : 매개변수로 받은 문자열을 int 타입으로 변환
    int num1 = Integer.parseInt(strNum1);
    int num2 = Integer.parseInt(strNum2);

    int result = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result);
  }
}












