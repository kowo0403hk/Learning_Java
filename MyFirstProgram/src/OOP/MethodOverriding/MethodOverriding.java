public class MethodOverriding {
  public static void main(String[] args) {
    // method override = declaring a method in a sub class which is already declared
    // in the parent class. By doing so, the child sub class (child) can has its own
    // implementation of the method

    Dog dog1 = new Dog("Hachi", 1);

    dog1.speak();
  }
}
