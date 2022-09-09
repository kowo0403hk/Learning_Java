import java.util.ArrayList;
import java.util.Arrays;

public class ArrStat {
  public static void main(String[] args) {
    // static array
    String[] cars = { "Camaro", "Corvette", "Tesla" };

    cars[0] = "Mustang";

    System.out.println(cars[0]);

    // dynamic array
    ArrayList carsDynamic = new ArrayList();

    for (int i = 0; i < 4; i++) {
      carsDynamic.add(i, i);
      System.out.println(carsDynamic.get(i));
    }

    // dynamic array with arrays as elements
    ArrayList<String[]> matrix = new ArrayList<String[]>();

    for (int i = 0; i < 4; i++) {
      String[] temp = { "1", "2", "3", "4" };
      matrix.add(i, temp);
      System.out.println(Arrays.toString(matrix.get(i)));
    }

  }
}
