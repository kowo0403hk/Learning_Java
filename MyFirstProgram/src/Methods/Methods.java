public class Methods {
  public static void main(String[] args) {
    // method = a block of code that is executed whenever it is called upon
    String name = "Alex";
    int age = 33;

    hello(name, age); // passing in an argument

    int x = 3;
    int y = 4;

    System.out.println(sum(x, y));
  }

  static void hello(String name, int age) { // processing the parameter
    System.out.println("Hello " + name + ".\nYou are " + age + " years old.");
  }

  static int sum(int num1, int num2) {
    return num1 + num2;
  }
}
