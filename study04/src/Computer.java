public class Computer {
//  멤버 메소드 선언
//  매개변수로 int 타입의 배열을 받음
//  반환 타입이 int 타입
  int sum1(int[] values) {
    int sum = 0;

    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }

    return sum;
  }

//  ... : 매개변수에 사용 시 매개변수의 수를 따로 지정하지 않고 가변적으로 사용할 수 있음
//  해당 형식으로 매개변수를 받으면 매개변수를 배열로 동작함
  int sum2 (int ... values) {
    int sum = 0;

    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }

    return sum;
  }
}












