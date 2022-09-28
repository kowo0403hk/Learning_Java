public class Dog extends Animal {

  String name;
  int age;

  Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void speak() {
    System.out.println(this.name + " is barking.");
  }
}
