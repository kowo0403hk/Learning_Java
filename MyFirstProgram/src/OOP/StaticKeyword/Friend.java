public class Friend {
  String name;
  static int numberOfFriends; // static keyword makes this variable a single copy shared within this class
  // if we remove this static keyword:
  // 1. we will no longer have access to this vairable by calling
  // Friend.numberOfFriends because it is not shared within the class anymore.
  // This makes every object of this class would have their very own copy of this
  // variable, e.g. friend1.numberOfFriends, friend2.numberOfFriends,
  // friend3.numberOfFriends, etc.

  Friend(String name) {
    this.name = name;
    numberOfFriends++;
  }

  // the static keyword makes the method as a class method. Without the keyword,
  // the method will become an instance method
  static void displayFriends() {
    System.out.println("You have " + numberOfFriends + " friends.");
  }
}
