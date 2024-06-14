import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileEx {
  public static void main(String[] args) throws IOException {
//    File 클래스 타입의 객체 생성, 지정한 경로의 폴더 및 파일을 사용하여 File 객체 생성
    File dir = new File("C:\\fullstack405\\java");
    File file1 = new File("C:\\fullstack405\\java\\test1.txt");
    File file2 = new File("C:\\fullstack405\\java\\test2.txt");
    File file3 = new File("C:\\fullstack405\\java\\test3.txt");

    if (dir.exists() == false) {
//      mkdir() : 폴더 생성
      dir.mkdir();
    }
    if (file1.exists() == false) {
//      새 파일 만들기
      file1.createNewFile();
    }
    if (file2.exists() == false) {
      file1.createNewFile();
    }
    if (file3.exists() == false) {
      file1.createNewFile();
    }

    File temp = new File("C:\\fullstack405\\java");
//    자바에서 제공하는 날짜 정보를 쉽게 표기하기 위한 클래스
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
//    listFiles() : 지정한 경로의 목록을 가져옴
    File[] contents = temp.listFiles();

    for (File file : contents) {
      System.out.println("날짜\t시간\t형태\t크기\t이름");
      System.out.println("-----------------------------------------------------");

      if (file.isDirectory()) {
        System.out.println("\t<DIR>\t\t\t" + file.getName());
      }
      else {
        System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
      }
      System.out.println();
    }
  }
}












