public class ObjectPassing {
  public static void main(String[] args) {
    Garage garage = new Garage();

    Car car1 = new Car("BMW");

    Car car2 = new Car("TESLA");

    garage.park(car1);
    garage.park(car2);

    garage.status();

    garage.unpark(car1);

    garage.status();
  }
}
