import java.util.ArrayList;
import java.util.Arrays;

public class TwoD {
  public static void main(String[] args) {
    // static

    // String[][] cars = new String[3][3];
    // cars[0][0] = "Camaro";
    // cars[0][1] = "Corvette";
    // cars[0][2] = "Silverado";
    // cars[1][0] = "Mustang";
    // cars[1][1] = "Ranger";
    // cars[1][2] = "F150";
    // cars[2][0] = "Ferrari";
    // cars[2][1] = "Lambo";
    // cars[2][2] = "Tesla";

    // for (int i = 0; i < cars.length; i++) {
    //   for (int j = 0; j < cars[i].length; j++) {
    //     System.out.print(cars[i][j] + " ");
    //   }
    // }

    // dynamic
    ArrayList<String[]> matrix = new ArrayList<String[]>();

    for (int i = 0; i < 4; i++) {
      String[] temp = { "1", "2", "3", "4" };
      matrix.add(i, temp);
      System.out.println(Arrays.toString(matrix.get(i)));
    }
  }
}
