public class Car {
  String make = "BMW";
  String model = "M3";
  int year = 2022;
  String color = "green";
  double price = 100000.00;

  void drive() {
    System.out.println("You drive the car.");
  }

  void brake() {
    System.out.println("You step on the brake.");
  }

  // override the toString() method
  public String toString() {
    return make + "\n" + model + "\n" + year + "\n" + color;
  }
}
