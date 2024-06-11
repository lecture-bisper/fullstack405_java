public class InstanceofEx {
  public static void main(String[] args) {
//    부모 클래스인 Parent3 클래스 타입의 변수에 자식 클래스인 Child3 클래스 타입의 객체를 저장
//    원본이 자식 클래스 객체인 부모 클래스 타입 변수
    Parent3 parentA = new Child3();
    method1(parentA);
    method2(parentA);

    System.out.println();

//    부모 클래스인 Parent3 클래스 타입의 객체 선언
//    원본이 부모 클래스 타입의 객체
    Parent3 parentB = new Parent3();
    method1(parentB);
    method2(parentB);
  }

//  instanceof를 사용하여 강제 타입 변환
  public static void method1(Parent3 parent) {
//    instanceof 를 사용하여 지정한 객체의 데이터 타입이 지정한 데이터 타입과 같은지 확인
    if (parent instanceof Child3) {
      Child3 child = (Child3) parent;
      System.out.println("method1 - Child3 타입으로 변환 성공");
    }
    else {
      System.out.println("method1 - Child3 타입으로 변환 실패");
    }
  }

//  instanceof 없이 강제 타입 변환
  public static void method2(Parent3 parent) {
    Child3 child = (Child3) parent;
    System.out.println("method2 - Child3 타입으로 변환 성공");
  }
}












