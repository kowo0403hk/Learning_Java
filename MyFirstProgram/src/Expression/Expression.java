public class Expression {
  public static void main(String[] args) throws Exception {
    // expression = operands + operators
    // operands = values, variables, numbers, quanities
    // operators = + - * / %

    int friends = 10;

    friends++;

    friends *= 2;

    System.out.println(friends);

    // for division, Java uses integer division, so any decimal will be truncated
    // after division
    // we can cast the new value to double but it's better to set the variable to
    // double so the decimal will be preserved

    double pig = 11;

    pig /= 3;

    System.out.println(pig);
  }
}
