
// need to import the utility package
import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name? ");
    String name = scanner.nextLine();

    System.out.println("How old are you? ");
    int age = scanner.nextInt(); // requires input that is an integer

    // The following scanner.nextLine() is to clear the scanner. That is because
    // scanner.nextInt does not read the "\n"
    // (we press "Enter" key after entering the age) and the \n will be left to the
    // following scanner.nextLine() to read. If we do not clear out the scanner
    // here, Java will simply run the scanner on line 25 and read the remaining \n
    // of the line. Which causes a bug where we will never get the chance to input
    // the food.
    scanner.nextLine();

    System.out.println("What is your favorite food? ");
    String food = scanner.nextLine();

    System.out.println("Hello, " + name);
    System.out.println("You are " + age + " years old.");
    System.out.println("You like " + food);

    // close the scanner to prevent memory leaks
    scanner.close();
  }
}
