public class Circle {
//  필드 선언, private 접근제한자 사용, 외부 접근 불가
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

//  getter/setter 를 사용하여 외부에서 필드에 접근할 수 있도록 함
  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }
}












