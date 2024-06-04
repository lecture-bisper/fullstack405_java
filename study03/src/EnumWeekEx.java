import java.util.Calendar;

public class EnumWeekEx {
  public static void main(String[] args) {
//    사용자가 생성한 열거형 데이터 타입의 변수 today를 선언
    Week today = null;

//    자바에서 제공하는 날짜 관련 클래스, 현재 시간을 기준으로 날짜 정보를 가져옴
    Calendar cal = Calendar.getInstance();
    int week = cal.get(Calendar.DAY_OF_WEEK);

    switch (week) {
      case 1:
        today = Week.SUNDAY;
        break;

      case 2:
        today = Week.MONDAY;
        break;

      case 3:
        today = Week.TUESDAY;
        break;

      case 4:
        today = Week.WEDNESDAY;
        break;

      case 5:
        today = Week.THURSDAY;
        break;

      case 6:
        today = Week.FRIDAY;
        break;

      case 7:
        today = Week.SATURDAY;
        break;
    }
    System.out.println("오늘 요일 : " + today);

    if (today == Week.SUNDAY) {
      System.out.println("일요일에는 축구를 합니다.");
    }
    else {
      System.out.println("열심히 자바 공부합시다.");
    }
  }
}












