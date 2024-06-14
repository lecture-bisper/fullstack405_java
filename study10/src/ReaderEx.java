import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
  public static void main(String[] args) throws IOException {
    Reader reader = new FileReader("C:\\fullstack405\\java\\test3.txt");
    int readData = 0;

    while (true) {
//      한글자씩 읽어오기
      readData = reader.read();
      if (readData == -1) {
        break;
      }
      System.out.println((char) readData);
    }
    reader.close();

    System.out.println();

    reader = new FileReader("C:\\fullstack405\\java\\test3-1.txt");
    int readCharNo = 0;
    char[] charBuff = new char[2];
    String data = "";

    while (true) {
//      지정한 char[] 크기만큼 읽어오기
      readCharNo = reader.read(charBuff);
      if (readCharNo == -1) {
        break;
      }
      data += new String(charBuff, 0, readCharNo);
    }
    System.out.println(data);
    reader.close();

    System.out.println("\n----- Reader로 파일 읽기 완료 -----\n");
  }
}












