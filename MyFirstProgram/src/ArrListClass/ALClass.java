import java.util.ArrayList;

public class ALClass {
  public static void main(String[] args) {
    // ArrayList = a resizable array (dynamic). Elements can be added an removed
    // after compilation phase.
    // ArrayList only stores reference data types (e.g. <String>, <Integer>,
    // <Double>, etc.)

    ArrayList<String> food = new ArrayList<String>();

    food.add("Pizza");
    food.add("Hamburger");
    food.add("Hotdog");

    for (int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }

  }
}
