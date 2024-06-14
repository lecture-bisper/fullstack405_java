import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx1 {
  public static void main(String[] args) throws IOException {

    OutputStream os = new FileOutputStream("C:\\fullstack405\\java\\test2.txt");
    byte[] data = "ABC".getBytes();

    for (int i = 0; i < data.length; i++) {
      os.write(data[i]);
    }
    os.flush();
    os.close();

    os = new FileOutputStream("C:\\fullstack405\\java\\test2-1.txt");
    byte[] data2 = "ABCDEFG".getBytes();
    os.write(data2);
    os.flush();
    os.close();

    System.out.println("\n----- 파일쓰기 완료 -----\n");
  }
}












