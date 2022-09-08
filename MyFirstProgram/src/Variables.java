public class Variables {
  public static void main(String[] args) throws Exception {
    int x = 123;

    byte b = 127;

    // Have to add "L" after the long number
    long y = 1239182479817581791L;

    // Have to add "f" after the float number
    float pi = 3.14159f;

    // up to 15 digits
    double d = 3.1415926;

    boolean z = true;

    char symbol = '@';

    // Anything with a reference data type starts with a capital letter
    String name = "Alex";

    // Java does not have string interpolation and we need to use String.format to
    // swap strings in by using "%s"
    String output = String.format("my number is %s", x);

    System.out.println(output);
  }
}
