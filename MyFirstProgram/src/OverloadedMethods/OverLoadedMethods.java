public class OverLoadedMethods {
  public static void main(String[] args) {
    // overloaded methods = methods that share the same name but have different
    // parameters
    // This is allowed because each method needs its own method signature. And
    // method signature is combined with method name and parameters
    // i.e. method signature = method name + parameters

    // hence, sharing the same name but with different amount of parameters is still
    // allowed

    int x = sum(1, 2, 3, 4);

    System.out.println(x);

    double y = doubleSum(3.0, 4.0, 5.0, 6.0);

    System.out.println(y);

  }

  static int sum(int a, int b) {
    System.out.println("This is overloaded method #1");
    return a + b;
  }

  static int sum(int a, int b, int c) {
    System.out.println("This is overloaded method #2");
    return a + b + c;
  }

  static int sum(int a, int b, int c, int d) {
    System.out.println("This is overloaded method #3");
    return a + b + c + d;
  }

  static double doubleSum(double a, double b) {
    System.out.println("This is overloaded method #1");
    return a + b;
  }

  static double doubleSum(double a, double b, double c) {
    System.out.println("This is overloaded method #2");
    return a + b + c;
  }

  static double doubleSum(double a, double b, double c, double d) {
    System.out.println("This is overloaded method #3");
    return a + b + c + d;
  }

}
