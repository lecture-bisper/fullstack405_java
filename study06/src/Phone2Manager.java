import java.util.Scanner;

public class Phone2Manager {
//  문제에서 언급한 main 메소드 대신 사용함
  public void printPhone2Manager() {
//    키보드 입력을 받기 위한 Scanner 클래스 타입의 객체 선언
    Scanner sc = new Scanner(System.in);

    System.out.print("인원수 >> ");
//    사용자가 입력한 인원수를 입력받음
    int count = sc.nextInt();

//    사용자가 입력한 인원수 만큼 Phone2 클래스 타입의 객체를 생성해야 하므로 Phone2 클래스 타입의 배열을 선언
    Phone2[] phone = new Phone2[count];

//    배열의 크기만큼 자동으로 사용자 데이터 입력받기
    for (int i = 0; i < count; i++) {
      System.out.print("이름과 전화번호(번호는 연속적으로 입력 ) >> ");
      String name = sc.next();
      String tel = sc.next();

//      Phone2 클래스 타입의 객체를 4번 생성하고 배열에 저장함
      phone[i] = new Phone2(name, tel);

      if ((i + 1) == count) {
        System.out.println("저장되었습니다..");
//        Scanner를 통해서 키보드 입력을 받았을 경우 입력을 위해서 사용한 메소드의 종류에 따라 '\n'이 메모리에 남아있는 경우가 있음
//        nextLint()를 마지막으로 한번 더 실행하여 버퍼의 내용을 완전히 비움
        sc.nextLine();
      }
    }

//    검색할 데이터를 입력받음, 반복문을 사용하여 필요없을 때까지 계속 입력받음
    while (true) {
//      검색할 데이터 입력받기
      System.out.print("검색할 이름 >> ");
      String search = sc.nextLine();

      String output = ""; // 검색 결과 출력용 변수 선언

//      단순 if문을 사용하여 입력된 데이터가 'exit'와 같으면 프로그램 종료, 아니면 계속 진행
      if (search.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }

//      입력받은 검색어를 기준으로 Phone2 클래스 타입의 배열에 저장된 내용을 검색
      for (int i = 0; i < phone.length; i++) {
//        입력받은 검색어와 동일한 내용이 있을 경우 검색 결과 출력용 변수에 데이터 입력 후 for문 종료
        if (search.equals(phone[i].getName())) {
          output = phone[i].getName() + "의 전화번호는 " + phone[i].getTel() + "입니다.";
          break;
        }
      }

//      출력용 변수에 데이터가 있는지 확인 후 출력
      if (output.length() > 0 && !output.equals("")) {
        System.out.println(output);
      }
      else {
        System.out.println(search + " 이 없습니다.");
      }
    }
  }
}












