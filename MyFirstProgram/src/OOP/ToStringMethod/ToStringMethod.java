public class ToStringMethod {
  public static void main(String[] args) {
    // toString() => special method that all objects inherit
    // it returns a string that "textually represents" the memory location of an
    // object
    // can be used both implicitly and explicitly

    Car myCar3 = new Car();

    // a lot of the time people use method override to rewrite the toString() method

    // explicit usage by calling the method, with method override
    System.out.println(myCar3.toString());

    // implicit usage (not calling the method)
    System.out.println(myCar3);

  }
}
