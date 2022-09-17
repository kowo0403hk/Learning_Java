public class PrintFMethod {
  public static void main(String[] args) {
    // printf() = an optional method to control, format, and display text to the
    // console window
    // accepts two arguments => format string + (object/variable/value)
    // specifiers => % [flags] [precision] [width] [conversion-character]

    // [conversion character]:
    System.out.printf("%d This is a format string", 123);

    boolean myBool = true;
    char myChar = '@';
    String myString = "Alex";
    int myInt = 50;
    double myDouble = 1000;

    // we need a matching conversion character for each of the data type

    System.out.printf("%b", myBool);
    System.out.printf("%c", myChar);
    System.out.printf("%s", myString);
    System.out.printf("%d", myInt);
    System.out.printf("%f", myDouble); // f is for both floating point and double values

    // [width]
    // the minimum number of characters to be written as output
    System.out.printf("Hello %10s", myString);
    // it prints 10 spaces of strings, if the variable does not have enough string
    // in it, the system will add spaces before the string variable
    // if there is a negative sign (-) before the width amount, the space will be
    // adjusted to left side (after the variable) instead of the right side

    // [precision]
    // sets the number of digits of precision when outputting floating-point values
    System.out.printf("You have this much money %.2f", myDouble);

    // [flags]
    // adds an effect to output based on the flag added to the format specifier
    // - => left-justify
    // + => output a plus (+) or minus (-) sign for a numeric value
    // 0 => numeric values are zero-padded
    // , => comma grouping separator if numbers > 1000

    System.out.printf("You have this much money %+,f", myDouble);
  }
}
