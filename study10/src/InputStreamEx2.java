import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx2 {
  public static void main(String[] args) throws IOException {
    InputStream is = new FileInputStream("C:\\fullstack405\\java\\test1.txt");
    int readByteNo; // 가져온 데이터 수를 저장할 변수
    byte[] readBytes = new byte[3]; // 가져온 데이터를 저장하는 변수
    String data = ""; // 가져온 byte[] 데이터를 문자열로 변환하여 저장할 변수

    while (true) {
//      read(byte[]) : 지정한 배열의 크기만큼 데이터를 가져옴, 없으면 -1 출력
      readByteNo = is.read(readBytes);
      if (readByteNo == -1) {
        break;
      }
//      new String() 생성자를 사용하여 byte[] 의 데이터를 문자열로 변환
//      기존의 data 변수에 추가함
      data += new String(readBytes, 0, readByteNo);
    }

    System.out.println(data);
    is.close(); // 파일 닫기
  }
}












