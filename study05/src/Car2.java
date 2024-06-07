public class Car2 {

  //  private 접근제한자를 사용한 필드
//  캡슐화를 통해서 외부에서 접근하지 못하도록 막음
  private int speed;
  private boolean stop;

  //  외부에서 캡슐화된 필드를 우회하여 사용하도록 getter/setter 제공함
  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
      this.stop = true;
    }
    else {
      this.speed = speed;
      this.stop = false;
    }
  }

  public boolean isStop() {
    return stop;
  }

  public void setStop(boolean stop) {
    this.stop = stop;
    this.speed = 0;
  }
}












