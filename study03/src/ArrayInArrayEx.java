public class ArrayInArrayEx {
  public static void main(String[] args) {
//    2차원 배열 선언, 빈 배열로 선언, 기본값으로 초기화
    int[][] mathScores = new int[2][3];

//    mathScores.length : 이차원 배열에서 배열명만 지정하면 해당 배열을 1차원 배열로 생각하고 길이를 출력함
    for (int i = 0; i < mathScores.length; i++) {
//      mathScores[i].length : 이차원 배열에서 배열명[index]로 지정하면 해당 index의 배열을 가져와서 가져온 배열의 크기를 출력함
      for (int j = 0; j < mathScores[i].length; j++) {
        System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
      }
    }
    System.out.println();

//    2차원 배열을 선언 시 라인 수는 정확히 입력해야 하지만 칸 수는 입력하지 않아도 상관없음
//    2차원 배열의 요소는 1차원 배열이기 때문에 1차원 배열을 새로 생성할 수 있으므로 1차원 배열의 크기는 생략해도 됨
    int[][] engScores = new int[2][];

//    기존의 2차원 배열의 요소로 1차원 배열을 저장하면서 1차원 배열을 새로 생성함
    engScores[0] = new int[3];
    engScores[1] = new int[3];

    for (int i = 0; i < mathScores.length; i++) {
      for (int j = 0; j < mathScores[i].length; j++) {
        System.out.println("engScores[" + i + "][" + j + "] = " + engScores[i][j]);
      }
    }
    System.out.println();

//    2차원 배열 생성과 동시에 데이터를 모두 입력
    int[][] javaScores = { {95, 80, 70}, {92, 96, 80} };

    for (int i = 0; i < mathScores.length; i++) {
      for (int j = 0; j < mathScores[i].length; j++) {
        System.out.println("javaScores[" + i + "][" + j + "] = " + javaScores[i][j]);
      }
    }
  }
}












