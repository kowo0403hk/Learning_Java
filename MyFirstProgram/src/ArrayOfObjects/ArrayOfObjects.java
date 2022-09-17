import java.util.ArrayList;

public class ArrayOfObjects {
  public static void main(String[] args) {
    // static array
    // Food[] fridge = new Food[3];

    Food food1 = new Food("pizza");
    Food food2 = new Food("hamburger");
    Food food3 = new Food("hotdog");

    // fridge[0] = food1;
    // fridge[1] = food2;
    // fridge[2] = food3;

    Food[] fridge = { food1, food2, food3 };

    System.out.println(fridge[0].name);
    System.out.println(fridge[1].name);
    System.out.println(fridge[2].name);

    // dynamic
    ArrayList<Food> fridge2 = new ArrayList<>();

    fridge2.add(food1);
    fridge2.add(food2);
    fridge2.add(food3);

    System.out.println(fridge2.get(0).name);
    System.out.println(fridge2.get(1).name);
    System.out.println(fridge2.get(2).name);
  }
}
