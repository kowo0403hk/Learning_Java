public class Swap {
  public static void main(String[] args) throws Exception {
    String x = "water";
    String y = "Kool-Aid";

    // declare a new variable to store values temporarily
    String temp;

    temp = x;
    x = y;
    y = temp;

    System.out.println("x: " + x);
    System.out.println("y: " + y);

  }
}
