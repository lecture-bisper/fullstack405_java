import java.io.*;

public class BufferedOutputStreamEx {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = null;
    FileOutputStream fos = null;
    BufferedInputStream bis = null;
    BufferedOutputStream bos = null;

    int data = -1;
    long start = 0;
    long end = 0;

//    FileInputStream을 사용하여 이미지 파일 열기
    fis = new FileInputStream("C:\\fullstack405\\forest.jpg");
//    BufferedInputStream을 사용하여 버퍼로 이미지를 읽어옴
    bis = new BufferedInputStream(fis);
//    FileOutputStream을 사용하여 쓰기를 진행할 파일 위치를 지정
    fos = new FileOutputStream("C:\\fullstack405\\java\\forest1.jpg");

    start = System.currentTimeMillis(); // 시작 시간 확인
//    BufferedInputStream을 사용하여 버퍼에서 실제 데이터를 읽어옴
    while ((data = bis.read()) != -1) {
//      FileOutputStream을 사용하여 실제로 파일을 지정한 위치에 씀
      fos.write(data);
    }
    fos.flush();
    fos.close();
    bis.close();
    fis.close();

    end = System.currentTimeMillis(); // 종료 시간 확인
    System.out.println("버퍼 미 사용 시 : " + (end - start) + " ms");

    fis = new FileInputStream("C:\\fullstack405\\forest.jpg");
    bis = new BufferedInputStream(fis);
    fos = new FileOutputStream("C:\\fullstack405\\java\\forest2.jpg");
//    BufferedOutputStream를 사용하여 파일 쓰기 준비
    bos = new BufferedOutputStream(fos);

    start = System.currentTimeMillis(); // 시작 시간 확인
//    BufferedInputStream를 사용하여 실제로 파일 내용 읽어오기
    while ((data = bis.read()) != -1) {
//      BufferedOutputStream를 사용하여 실제로 파일을 씀
      bos.write(data);
    }

    bos.flush();
    bos.close();
    fos.close();
    bis.close();
    fis.close();
    end = System.currentTimeMillis(); // 종료시간 확인

    System.out.println("버퍼 사용 시 : " + (end - start) + "ms");


  }
}












