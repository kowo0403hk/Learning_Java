public class Inheritance {
  public static void main(String[] args) {
    // inheritance = the process where one class acquires the attributes and methods
    // of another

    Car car = new Car();

    car.go();

    Bicycle bike = new Bicycle();

    bike.stop();

    System.out.println(car.speed);
    System.out.println(bike.speed);

    System.out.println(car.doors);
    System.out.println(bike.pedals);
    System.out.println(bike.pedals);
  }
}
