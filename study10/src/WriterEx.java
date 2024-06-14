import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
  public static void main(String[] args) throws IOException {
    System.out.println("----- write() 사용 -----");
    Writer writer = new FileWriter("C:\\fullstack405\\java\\test4.txt");
//    toCharArray() : 지정한 문자열을 char[]로 변경
    char[] data = "홍길동".toCharArray();

    for (int i = 0; i < data.length; i++) {
//      write() : 한글자씩 파일에 쓰기
      writer.write(data[i]);
    }
    writer.flush();
    writer.close();

    System.out.println("----- write(char[]) 사용 -----");
    writer = new FileWriter("C:\\fullstack405\\java\\test4-1.txt");
    char[] data2 = "임꺽정".toCharArray();

//    write(char[]) : 지정한 char[] 에 저장된 내용을 모두 쓰기
    writer.write(data2);
    writer.flush();
    writer.close();

    System.out.println("----- write(String) 사용 -----");
    writer = new FileWriter("C:\\fullstack405\\java\\test4-2.txt");

    String writeData = "String 타입으로 파일 쓰기";
//    write(String) : 문자열을 바로 쓰기
    writer.write(writeData);
    writer.flush();
    writer.close();

    System.out.println("\n----- Writer로 파일 쓰기 완료 -----\n");
  }
}












