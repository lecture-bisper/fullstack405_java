public class DefaultExtendsEx {
  public static void main(String [] args) {

    ChildInter1 ci1 = new ChildInter1() {
//      ParentInter에서 상속받은 추상 메소드를 오버라이딩하여 사용
      @Override
      public void method1() {
        System.out.println("ci1의 method1()");
      }

//      ChildInter1에서 상속받은 추상 메소드를 오버라이딩
      @Override
      public void method3() {
        System.out.println("ci1의 method3()");
      }
    };

    ci1.method1();
    ci1.method2();
    ci1.method3();

    System.out.println("\n ----------------------\n");

    ChildInter2 ci2 = new ChildInter2() {
//      ParentInter에서 상속받은 추상 메소드를 오버라이딩하여 사용
      @Override
      public void method1() {
        System.out.println("ci2의 method1()");
      }
//      ParentInter에서 상속받은 디폴트 메소드를 ChildInter2에서 오버라이딩하여 추상메소드로 변환
//      ChildInter2에서 상속받은 추상 메소드를 오버라이딩하여 사용
      @Override
      public void method2() {
        System.out.println("ci2의 method2()");
      }
//      ChildInter2에서 상속받은 추상 메소드를 오버라이딩
      @Override
      public void method3() {
        System.out.println("ci2의 method3()");
      }
    };

    ci2.method1();
    ci2.method2();
    ci2.method3();

    System.out.println("\n ----------------------\n");

    ChildInter3 ci3 = new ChildInter3() {
//      ParentInter에서 상속받은 추상 메소드를 오버라이딩하여 사용
      @Override
      public void method1() {
        System.out.println("ci3의 method1()");
      }
      
//      ParentInter에서 상속받은 디폴트 메소드를 오버라이딩하여 디폴트 메소드의 내용을 새로 수정
//      ChildInter3에서는 오버라이딩된 디폴트 메소드를 자식 클래스에게 상속해줌
      
//      ChildInter3에서 상속받은 추상 메소드를 오버라이딩
      @Override
      public void method3() {
        System.out.println("ci3의 method3()");
      }
    };

    ci3.method1();
    ci3.method2();
    ci3.method3();

  }
}












