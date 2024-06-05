public class ComputerEx {
  public static void main(String[] args) {

//    Computer 클래스 타입의 객체 myCom 생성
    Computer myCom = new Computer();

//    int 타입의 배열 선언
    int[] arrNum1 = {10, 20, 30};
//    매개변수로 int 타입의 배열 arrNum1을 전달함
    int result1 = myCom.sum1(arrNum1);
    System.out.println("result1 : " + result1);

    int result2 = myCom.sum1(new int[] {10, 20, 30});
    System.out.println("result2 : " + result2);

    int result3 = myCom.sum2(10, 20, 30);
    System.out.println("result3 : " + result3);

    int result4 = myCom.sum2(10, 20, 30, 40, 50);
    System.out.println("result4 : " + result4);
  }
}












