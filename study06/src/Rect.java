public class Rect {
  private int width; // 너비
  private int height; // 높이

//  생성자
  public Rect(int width, int height) {
//    매개변수로 받은 데이터로 필드 초기화
    this.width = width;
    this.height = height;
  }

//  메소드, 필드인 너비, 높이를 곱하여 넓이를 출력
  public int getArea() {
    return width * height;
  }
}












