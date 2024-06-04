public class ArrayEx {
  public static void main(String[] args) {
    System.out.println("----- 1번 방식으로 배열 선언 -----\n");
//    자바에서 배열 생성하는 방법
//    int 타입의 배열 생성, 배열명 scores, 생성과 동시에 저장되는 데이터 83, 90, 87
    int[] scores = {83, 90, 87};

//    배열의 데이터 사용법은 js의 배열과 동일함
    System.out.println("scores[0] : " + scores[0]);
    System.out.println("scores[1] : " + scores[1]);
    System.out.println("scores[2] : " + scores[2]);

    int sum = 0;

    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    System.out.println("총합 : " + sum);
    double average = (double)sum / scores.length;
    System.out.println("평균 : " + average);

    System.out.println("\n ----- 2번 방식으로 배열 선언 ----- \n");

//    2번 방식으로 배열 선언
//    int 타입으로 배열 선언, 배열명 arr1로 지정, new 키워드로 배열의 타입, 크기 지정
//    배열을 생성하고 아무런 데이터를 입력하지 않으면 초기값이 저장되어 있음
    int[] arr1 = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

//    배열에 데이터 저장
    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;
    arr1[3] = 40;
    arr1[4] = 50;

    for (int i = 0; i < 5; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

    double[] arr2 = new double[3];
    for (int i = 0; i < 3; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }

    arr2[0] = 0.1;
    arr2[1] = 0.2;
    arr2[2] = 0.3;
    for (int i = 0; i < 3; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }

    String arr3[] = new String[3];
    for (int i = 0; i < arr3.length; i++) {
      System.out.println("arr3[" + i + "] : " + arr3[i]);
    }

    arr3[0] = "1월";
    arr3[1] = "2월";
    arr3[2] = "3월";
    for (int i = 0; i < arr3.length; i++) {
      System.out.println("arr3[" + i + "] : " + arr3[i]);
    }

    System.out.println("\n ----- 3번 방식으로 배열 선언 -----\n");

//    배열도 빈 배열로 선언이 가능, 배열은 참조 타입
    int[] arr4; // 배열만 먼저 선언, 빈 배열, 배열의 크기가 없음
    int[] arr5 = null; // 배열만 먼저 선언, null로 초기화, 배열의 크기가 없음
    
//    {데이터1, ...} 을 사용한 배열 선언 방식은 배열 선언과 동시에 입력할 때만 사용할 수 있음
//    빈 배열 선언 후 나중에 {데이터, ...} 로 입력하면 오류 발생
//    배열만 먼저 선언 후 나중에 데이터 입력하여 배열을 선언 시 반드시 new 키워드를 사용해야 함
//    arr4 = {70, 80, 90};

//    배열 선언 2번 형식으로 배열을 선언
//    기존 배열 선언 2번 형식과 동일함, 배열 선언 시 크기를 지정함
    arr4 = new int[3];
    for (int i = 0; i < arr4.length; i++) {
      System.out.println("arr4[" + i + "] : " + arr4[i]);
    }

    arr4[0] = 10;
    arr4[1] = 20;
    arr4[2] = 30;
    for (int i = 0; i < arr4.length; i++) {
      System.out.println("arr4[" + i + "] : " + arr4[i]);
    }
    
//    배열 선언 2번 형식과 1번 형식이 모두 포함된 방식으로 배열 선언
//    {데이터, ... } 에 입력된 데이터의 개수에 따라서 배열의 크기가 결정됨
    arr5 = new int[]{70, 80, 90};
    for (int i = 0; i < arr5.length; i++) {
      System.out.println("arr5[" + i + "] : " + arr5[i]);
    }
  }
}












