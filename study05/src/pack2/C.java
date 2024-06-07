// pack2 패키지
package pack2;

//import pack1.A;
import pack1.B;

// 패키지 pack2 에 포함된 클래스 C
public class C {
//  패키지 pack1에 포함된 클래스 A 타입의 변수 a를 선언, 오류 발생
//  pack1 패키지 포함된 클래스 A는 default 접근제한자를 사용하여 동일한 패키지가 아니면 접근할 수 없음
//  A a;
  
//  패키지 pack1에 포함된 클래스 B 타입의 변수 b를 선언, 정상 사용
//  pack1 패키지에 포함된 클래스 B는 public 접근제한자를 사용하여 다른 패키지에서도 사용할 수 있음
  B b;
}












