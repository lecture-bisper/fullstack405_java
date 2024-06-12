public class AnimalEx {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    dog.sound();
    cat.sound();
    System.out.println("\n ---------------------\n");

//    추상 클래스인 Animal 클래스 타입의 변수 선언, 추상 클래스는 객체 생성이 불가능하지만 변수 선언은 상관없음
    Animal animal = null;
//    추상 클래스는 부모 클래스 사용하기 위함
//    클래스 다형성에 의해서 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입할 수 있음
//    부모 이름으로 자식 객체의 멤버를 호출할 수 있음
    animal = new Dog();
    animal.sound();
    animal = new Cat();
    animal.sound();
    System.out.println("\n ---------------------\n");

    animalSound(new Dog());
    animalSound(new Cat());
  }

  public static void animalSound(Animal animal) {
    animal.sound();
  }
}












