public class TryWithResourceEx {
  public static void main(String[] args) throws Exception {

    System.out.println("\n ----- try ~ catch ~ finally 방식 -----\n");

    FileInputStream fis = null;

    try {
      fis = new FileInputStream("text.txt");
      fis.read();
      throw new Exception(); // 예외를 강제로 발생 시킴
    }
    catch (Exception e) {
      System.out.println("예외가 발생하였습니다.");
    }
    finally {
      fis.close();
    }

    System.out.println("\n ----- try ~ with ~ resource 방식 -----\n");

    try (FileInputStream fis2 = new FileInputStream("test.txt")) {
      fis2.read();
      throw new Exception();
    }
    catch (Exception e) {
      System.out.println("예외가 발생하였습니다.");
    }
  }
}












