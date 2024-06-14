import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {
  public static void main(String[] args) {

    System.out.println("\n----- Vector 사용하기 -----\n");
//    부모 타입에 자식 클래스 타입의 객체를 저장하여 사용
    List<Board> list = new Vector();

//    백터에 데이터 추가
    list.add(new Board("제목1", "내용1", "글쓴이1"));
    list.add(new Board("제목2", "내용2", "글쓴이2"));
    list.add(new Board("제목3", "내용3", "글쓴이3"));
    list.add(new Board("제목4", "내용4", "글쓴이4"));
    list.add(new Board("제목5", "내용5", "글쓴이5"));

//    벡터에 저장된 데이터 삭제
    list.remove(2);
    list.remove(3);

    for(int i = 0; i < list.size(); i++){
//      벡터에 저장된 데이터가 Board 클래스 타입의 객체이므로 저장된 데이터를 출력 시 받아줄 변수도 Board 클래스 타입의 변수로 받아야 함
      Board board = list.get(i);
      System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
    }

    System.out.println("\n----- ArrayList 로 사용하기 -----\n");

    List<Board> list2 = new ArrayList();

    for (int i = 0; i < 5; i++) {
      Board board = new Board("제목" + (i + 1), "내용" + (i + 1), "글쓴이" + (i + 1));
      list2.add(board);
    }

    list2.remove(2);
    list2.remove(3);

    for(int i = 0; i < list2.size(); i++){
      Board board = list2.get(i);
      System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
    }
  }
}












