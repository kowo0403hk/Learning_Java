import java.util.Scanner;

public class LogicalOp {
  public static void main(String[] args) {
    // &&, || and !

    // AND && operator
    int temp = 25;

    if (temp > 30) {
      System.out.println("It is hot outside");
    } else if (temp >= 20 && temp < 30) {
      System.out.println("It is warm outside");
    } else {
      System.out.println("It is cold outside");
    }

    // OR || operator and NOT ! operator
    Scanner scanner = new Scanner(System.in);

    System.out.println("You are playing a game! Press q or Q to quit");

    String response = scanner.next();

    // if (response.equals("q") || response.equals("Q")) {
    // System.out.println("You quit the game.");
    // } else {
    // System.out.println("You are still playing the game.");
    // }
    if (!response.equals("q") && !response.equals("Q")) {
      System.out.println("You are still playing the game.");
    } else {
      System.out.println("You quit the game.");
    }

    scanner.close();

  }
}
