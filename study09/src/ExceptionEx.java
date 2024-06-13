public class ExceptionEx {
  public static void main(String[] args) {

//    ArrayIndexOutOfBoundsException 발생
    int[] arrNumber = {10, 20, 30, 40, 50};

    System.out.println("----- 배열 내용 출력 -----");
    for (int i = 0; i < 6; i++) {
      System.out.println("배열 arrNumber[" + i + "] : " + arrNumber[i]);
    }

//    NumberFormatException 발생
    String data1 = "100";
    String data2 = "a100";

    int value1 = Integer.parseInt(data1);
    int value2 = Integer.parseInt(data2);

    int result = value1 + value2;
    System.out.println(data1 + " + " + data2 + " = " + result);

//    NullPointerException 발생
    String str = null;
    System.out.println(str.toString());

//    ClassCastException 발생
    Dog dog = new Dog();
    Cat cat = new Cat();

    Animal animal = dog;
    animal = cat;

    Dog dog2 = (Dog) animal;
  }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}












