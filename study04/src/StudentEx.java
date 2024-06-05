public class StudentEx {
  public static void main(String[] args) {
//    Student 클래스 타입의 변수 s1을 선언
//    new 키워드를 사용하여 Student 클래스의 생성자 Student() 를 호출하고, 힙 메모리 영역에 Student 클래스 객체를 생성 후 그 주소를 되돌려줌
    Student s1 = new Student();
    System.out.println("s1 변수가 Student 객체를 참조함");
    
//    Student 클래스 타입의 변수 s2를 선언하고 new 키워드를 사용하여 Student 클래스의 생성자 Student()를 호출하고, 힙 메모리 영역에 Student 클래스 객체를 생성 후 그 주소를 되돌려줌
    Student s2 = new Student();
    System.out.println("s2 변수가 또 다른 Student 객체를 참조함");
  }
}












