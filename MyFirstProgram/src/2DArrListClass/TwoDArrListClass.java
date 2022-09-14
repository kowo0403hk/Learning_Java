import java.util.*;

public class TwoDArrListClass {

  public static void main(String[] args) {
    // 2D ArrayList = a dynamic list of lists
    // You can change the size of these lists during runtime
    ArrayList<String> bakeryList = new ArrayList<>();

    bakeryList.add("Pasta");
    bakeryList.add("Garlic Bread");
    bakeryList.add("Donuts");

    System.out.println(bakeryList);

    ArrayList<String> produceList = new ArrayList<>();

    produceList.add("Tomatoes");
    produceList.add("Zucchini");
    produceList.add("Peppers");

    System.out.println(produceList);

    ArrayList<String> drinksList = new ArrayList<>();

    drinksList.add("Soda");
    drinksList.add("Coffee");
    drinksList.add("Beer");

    System.out.println(drinksList);

    ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinksList);

    // print [[Pasta, Garlic Bread, Donuts], [Tomatoes, Zucchini, Peppers], [Soda,
    // Coffee, Beer]]
    System.out.println(groceryList);
  }
}
