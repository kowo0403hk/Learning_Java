import java.util.ArrayList;

public class ForLoop {
  public static void main(String[] args) {

    // not using collection framework, there will be no access to ready made
    // class/interface methods

    // array is static, not dynamic
    System.out.println("With out collection framework: ");

    int[] nums = new int[10];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = i + 1;
      System.out.println(nums[i]);
    }

    // with collection framework, we can have access to the collection methods for
    // the array

    // array is dynamic here
    System.out.println("With collection framework: ");

    ArrayList a = new ArrayList(10);

    for (int j = 0; j < 20; j++) {
      a.add(j, j + 1);
      System.out.println(a.get(j));
    }

  }
}
