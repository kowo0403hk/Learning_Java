public class Hero extends Person {
  String power;

  Hero(String name, int age, String power) {
    super(name, age);
    this.power = power;
  }

  // calling super on super class' method
  public String toString(String personality) {
    return super.toString(personality) + this.power;
  }
}
