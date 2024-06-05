public class CalculatorEx {
  public static void main(String[] args) {
//    클래스 Calculator 타입의 변수 myCal선언
//    new 키워드를 사용하여 Calculator() 생성자 호출 및 객체 생성, 그 주소를 돌려줌
    Calculator myCal = new Calculator();
    myCal.powerOn();

    int result = myCal.plus(10, 20);
    System.out.println("result : " + result);

//    byte 타입의 변수 저장
    byte x = 10;
    byte y = 4;
//    divide() 호출 시 매개변수로 byte 타입의 데이터를 전달
//    자동 타입 변환에 의해서 byte 타입의 int 타입으로 변환됨
    double result2 = myCal.divide(x, y);
    System.out.println("result2 : " + result2);

    myCal.powerOff();
  }
}












