public class StaticKey {
  public static void main(String[] args) {
    // static = modifer. A single copy of a variable/method is created and shared.
    // The class "owns" the static member is shared within the class

    Friend friend1 = new Friend("SpongeBob");
    Friend friend2 = new Friend("Patrick");
    Friend friend3 = new Friend("Squidward");
    Friend friend4 = new Friend("Sandy");

    Friend.displayFriends();
  }
}
