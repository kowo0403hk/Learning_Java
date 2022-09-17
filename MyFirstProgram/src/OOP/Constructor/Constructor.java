public class Constructor {
  public static void main(String[] args) {
    Human alex = new Human("Alex", 33, 65.0);

    System.out.println(alex.name);
    System.out.println(alex.age);
    System.out.println(alex.weight);
    alex.eat();

    Human human2 = new Human("Morty", 16, 50);

    System.out.println(human2.name);
    System.out.println(human2.age);
    System.out.println(human2.weight);
    human2.drink();
  }
}
