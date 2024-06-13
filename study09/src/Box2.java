// 타입 파라미터를 사용하여 제네릭 클래스로 선언
public class Box2<T> {

//  타입 파라미터 타입의 필드 선언
  private T t;

//  매갭변수를 타입 파라미터 타입으로 받음
  public void set(T t) {
    this.t = t;
  }

//  반환값을 타입 파라미터 타입으로 되돌려줌
  public T get() {
    return this.t;
  }
}












