import java.util.ArrayList;

public class Garage {
  ArrayList<Car> cars;

  Garage() {
    this.cars = new ArrayList<>();
  }

  void park(Car car) {
    this.cars.add(car);
    System.out.println("Your " + car.name + " is parked.");
  }

  void unpark(Car car) {
    this.cars.remove(car);
    System.out.println("Your " + car.name + " has been unparked.");
  }

  void status() {
    System.out.println("You have " + this.cars.size() + " car(s) in your garage: ");

    for (int i = 0; i < this.cars.size(); i++) {
      System.out.println(this.cars.get(i).name);
    }

  }
}
