// Song 클래스 선언
public class Song {
//  필드 선언, 외부에서 바로 접근할 수 없도록 private 접근제한자 사용
  private String title;

//  매개변수가 있는 생성자 사용
  public Song(String title) {
//    this 키워드를 사용하여 매개변수와 동일한 이름을 가지고 있는 필드를 구분함
    this.title = title;
  }

//  접근제한자가 private인 필드의 내용을 외부에서 사용할 수 있도록 getter 를 제공
  public String getTitle() {
    return title;
  }
}












