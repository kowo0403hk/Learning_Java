import java.util.Scanner;

public class NestedLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int ROWS;
    int COLS;

    String symbol = "";

    System.out.println("Enter # of rows: ");
    ROWS = scanner.nextInt();

    System.out.println("Enter # of columns: ");
    COLS = scanner.nextInt();

    System.out.println("Enter symbol to use: ");
    symbol = scanner.next();

    System.out.println("Below is your matrix: ");

    for (int r = 0; r < ROWS; r++) {
      for (int c = 0; c < COLS; c++) {
        System.out.print(symbol);
      }
      System.out.println();
    }

    scanner.close();
  }
}
