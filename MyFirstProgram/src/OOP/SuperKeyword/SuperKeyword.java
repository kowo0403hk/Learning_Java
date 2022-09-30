public class SuperKeyword {
  public static void main(String[] args) {
    // super = keyword that refers to the superclass (parent) of an object. It is
    // very similar to "this" keyword

    Hero batman = new Hero("Batman", 42, "Rich");
    Hero superman = new Hero("Superman", 43, "everything");

    System.out.println(batman.name);
    System.out.println(batman.age);
    System.out.println(batman.power);

    System.out.println(superman.toString());
  }
}
