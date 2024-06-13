public class TryCatchEx {
  public static void main(String[] args) {
//    ArrayIndexOutOfBoundsException 발생
    System.out.println("\n----- ArrayIndexOutOfBoundsException 예외처리 -----\n");
    int[] arrNumber = {10, 20, 30, 40, 50};

    try {
      for (int i = 0; i < 10; i++) {
        System.out.println("배열 arrNumber[" + i + "] : " + arrNumber[i]);
      }
      System.out.println("배열 내용 출력 완료!!");
    }
    catch (Exception e) {
      System.out.println("배열의 최대 범위를 벗어났습니다.");
    }

//    NumberFormatException 발생
    System.out.println("\n----- NumberFormatException 예외처리 -----\n");
    String data1 = "100";
    String data2 = "a100";

    int value1 = 0;
    int value2 = 0;
    int result = 0;

    try {
      value1 = Integer.parseInt(data1);
      value2 = Integer.parseInt(data2);
      result = value1 + value2;
    }
    catch (NumberFormatException e) {
      System.out.println("숫자가 아닌 데이터를 정수로 변환하려고 하였습니다.");
    }

    System.out.println(data1 + " + " + data2 + " = " + result);

//    NullPointerException 발생
    System.out.println("\n----- NullPointerException 예외처리 -----\n");
    try {
      String str = null;
      System.out.println(str.toString());
    }
    catch (NullPointerException e) {
      System.out.println("null 인 데이터를 사용하려고 하였습니다.");
    }

//    ClassCastException 발생
    System.out.println("\n----- ClassCastException 예외처리 -----\n");
    Dog dog = new Dog();
    Cat cat = new Cat();

    Animal animal = dog;
    animal = cat;

    Dog dog2 = null;
    try {
      dog2 = (Dog) animal;
    }
    catch (ClassCastException e) {
      System.out.println("잘못된 변환입니다.");
    }

    System.out.println("\n ----- 프로그램 정상 종료!! ----- \n");

  }
}












