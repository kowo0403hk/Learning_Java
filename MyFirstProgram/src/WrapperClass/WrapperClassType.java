public class WrapperClassType {
  public static void main(String[] args) {
    // wrapper class = provieds a way to use primitive data types as reference data
    // types.
    // reference data types contain useful methods can be used with collections
    // (e.g. ArrayList)

    // primitive // wrapper
    // --------- // -------
    // boolean // Boolean
    // char // Character
    // int // Integer
    // double // Double

    // Same idea as String or Number or Array or Object in Javascript

    // autoboxing = the automatic conversion that the Java compiler makes between
    // the primitive type and the corresponding wrapper class

    Boolean a = true; // autoboxing (kinda like type inference?)

    Character b = '@';

    Integer c = 123;

    Double d = 10.33;

    String e = "Alex";

    // wrapper class methods
    a.booleanValue();
    c.valueOf(0);

    // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class
    // to primitive
    if (a == true) {
      // even though variable a is a wrapper class variable, but Java will still go
      // through the unboxing process and get the primitive value
      System.out.println("a is true");
    }

    if (b == '@') {
      System.out.println("b is a character");
    }
  }
}
