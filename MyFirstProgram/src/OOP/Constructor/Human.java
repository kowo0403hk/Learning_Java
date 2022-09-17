public class Human {

  // properties for this object class
  String name;
  int age;
  double weight;

  Human(String name, int age, double weight) {
    // use "this" for binding
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  void eat() {
    System.out.println(this.name + " is eating.");
  }

  void drink() {
    System.out.println(this.name + " is drinking.");
  }
}
