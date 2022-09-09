import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String name = "";

    while (name.isBlank()) {
      System.out.println("Enter your name: ");

      name = scanner.nextLine();
    }

    // do..while loop, the following block of code will AT LEAST run once
    // do {
    // System.out.println("Enter your name: ");

    // name = scanner.nextLine();
    // } while (name.isBlank());

    System.out.println("Hello " + name);
  }
}
