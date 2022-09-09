import java.util.Random;

public class RandomInstance {
  public static void main(String[] args) {
    Random random = new Random();

    // int x = random.nextInt(6) + 1;

    // nextDouble method is going to give us a number between 0 and 1
    double y = random.nextDouble();

    boolean z = random.nextBoolean();

    System.out.println(y);
  }
}
