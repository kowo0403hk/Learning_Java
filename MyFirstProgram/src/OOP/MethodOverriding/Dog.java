public class Dog extends Animal {

  String name;
  int age;

  Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  void speak() {
    System.out.println(this.name + " is barking.");
  }
}
