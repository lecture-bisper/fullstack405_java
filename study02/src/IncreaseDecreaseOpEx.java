public class IncreaseDecreaseOpEx {
  public static void main(String[] args) {
    int x = 10;

//    증감 연산자 사용 시 하나의 라인에 단독으로 사용하면 증감연산자가 앞에 있으나 뒤에 있으나 동일한 결과를 출력함
    System.out.println("변수 x의 값 : " + x);
    ++x;
    System.out.println("++x의 값 : " + x);
    x--;
    System.out.println("x--의 값 : " + x);

    System.out.println();

    x = 10;
//    증감 연산자를 다른 연산식과 함께 사용 시 증감 연산자의 위치에 따라서 다르게 동작함
    System.out.println("원본 x의 값 : " + x);
    System.out.println("++x 의 값 : " + ++x);
    System.out.println("x++ 의 값 : " + x++);
    System.out.println("현재 x의 값 : " + x);
    System.out.println("x-- 의 값 : " + x--);
    System.out.println("--x 의 값 : " + --x);
    System.out.println("현재 x의 값 : " + x);
  }
}












