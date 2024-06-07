public class Earth {

//  static final로 선언하여 상수로 선언
  static final double EARTH_RADIUS = 6400;
//  초기화가 되지않은 상수
  public static final double EARTH_SURFACE_AREA;

//  정적 초기화 블록
//  정적 초기화 블록이 정적 멤버를 위한 일종의 생성자이기 때문에 static final 로 지정한 상수를 초기화 할 수 있음
  static {
//    Math : 자바에서 제공하는 수학 관련 클래스
//    Math.PI : 수학 관련 클래스에서 제공하는 원주율 상수
    EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
  }
}












