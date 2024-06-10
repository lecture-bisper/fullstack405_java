// static 메소드만 가짐
public class CircleManager {
  public static void copy(Circle src, Circle dest) {
    dest.setRadius(src.getRadius());
  }

//  a와 b의 반지름이 같으면 true 리턴
  public static boolean equals(Circle a, Circle b) {
    if (a.getRadius() == b.getRadius()) {
      return true;
    }
    else {
      return false;
    }
  }
}












