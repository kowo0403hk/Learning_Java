public class ObjectExample {
  public static void main(String[] args) {
    // object => an instance of a class that may contain attributes and methods
    // example => phone, desk, computer, coffee cup

    Car myCar1 = new Car();

    System.out.println(myCar1.make);
    System.out.println(myCar1.model);
    System.out.println(myCar1.color);
    System.out.println(myCar1.price);
    myCar1.drive();
    myCar1.brake();

    Car myCar2 = new Car();

  }
}
