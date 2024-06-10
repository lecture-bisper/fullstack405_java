import javax.management.loading.MLetContent;
import java.util.Scanner;

public class quiz {
  public static void quiz1() {
//    Song 클래스 타입의 객체 mySong 생성
    Song mySong = new Song("Nessun Dorma");
//    Song 클래스 타입의 객체 yourSong 생성
    Song yourSong = new Song("공주는 잠 못 이루고");
//    객체 mySong의 인스턴스 멤버 중 getTitle() 메소드를 사용
    System.out.println("내 노래는 " + mySong.getTitle());
    System.out.println("너 노래는 " + yourSong.getTitle());
  }

  public static void quiz2() {
//    화면 출력이 먼저, 화면 출력 후 바로 뒤에 입력해야 하기 때문에 print() 사용
    Scanner sc = new Scanner(System.in);
    System.out.print("이름과 전화번호 입력 >> ");
//    키보드 입력 받기
    String name = sc.next();
    String tel = sc.next();
//    입력받은 내용을 기반으로 Phone 클래스 타입의 객체 생성
    Phone phone1 = new Phone(name, tel);

    System.out.print("이름과 전화번호 입력 >> ");
//    위에 이미 선언한 변수 재활용
    name = sc.next();
    tel = sc.next();
//  입력받은 내용을 기반으로 Phone 클래스 타입의 두번째 객체 생성
    Phone phone2 = new Phone(name, tel);

    System.out.println(phone1.getName() + "의 전화번호 : " + phone1.getTel());
    System.out.println(phone2.getName() + "의 전화번호 : " + phone2.getTel());

//    System.out.print("이름 입력 >> ");
//    String name = sc.nextLine();
//    System.out.print("전화번호 입력 >> ");
//    String tel = sc.nextLine();
//
//    Phone phone1 = new Phone(name, tel);
//
//    System.out.print("이름 입력 >> ");
//    name = sc.nextLine();
//    System.out.print("전화번호 입력 >> ");
//    tel = sc.nextLine();
//
//    Phone phone2 = new Phone(name, tel);
//
//    System.out.println(phone1.getName() + "의 전화번호 : " + phone1.getTel());
//    System.out.println(phone2.getName() + "의 전화번호 : " + phone2.getTel());
  }

  public static void quiz3() {
    Scanner sc = new Scanner(System.in);
//    Rect 클래스 타입의 배열 rect 생성, new Rect[4]를 사용하여 크기가 4인 배열 생성
//    Rect 클래스 타입의 배열을 생성한 것이지 Rect 클래스 타입의 객체를 생성한 것은 아님, Rect 클래스 타입의 배열 요소는 현재 모두 null 임
    Rect[] rect = new Rect[4];

    for (int i = 0; i < rect.length; i++) {
      System.out.print((i + 1) + " 너비와 높이 >> ");
//      nextInt() 를 사용하여 키보드 입력을 정수로 받음
      int width = sc.nextInt();
      int heigth = sc.nextInt();
//      Rect 클래스 타입의 배열의 i번 index에 새로운 Rect 클래스 타입의 객체를 생성하여 저장
      rect[i] = new Rect(width, heigth);

      if (i + 1 == rect.length) {
        System.out.println("저장하였습니다..");
      }
    }

//    총합을 저장할 변수 선언
    int total = 0;

//    for문을 통해서 Rect 클래스 타입의 배열이 가지고 있는 모든 데이터 출력
    for (int i = 0; i < rect.length; i++) {
      total = total + rect[i].getArea();
    }

    System.out.println("사각형의 전체 합은 : " + total);
  }

  public static void quiz4() {
    Phone2Manager pm = new Phone2Manager();
    pm.printPhone2Manager();
  }

  public static void quiz5() {
    StaticTest staticTest = new StaticTest();
    staticTest.printStaticTest();
  }

  public static void main(String[] args) {
//    System.out.println("\n----- 문제 1) -----\n");
//    quiz1();
//
//    System.out.println("\n ----- 문제 2) ----- \n");
//    quiz2();
//
//    System.out.println("\n ----- 문제 3) ----- \n");
//    quiz3();

//    System.out.println("\n ----- 문제 4) ----- \n");
//    quiz4();

    System.out.println("\n ----- 문제 5) ----- \n");
    quiz5();

  }
}












