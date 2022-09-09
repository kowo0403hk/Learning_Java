public class MethodForString {
  public static void main(String[] args) {
    String name = "Alex";

    boolean compareName = name.equals("alex");

    boolean compareNameIgnoreCase = name.equalsIgnoreCase("alex");

    System.out.println(compareName);

    System.out.println(compareNameIgnoreCase);

    int length = name.length();

    char charAtIndex = name.charAt(0);

    // casting the char to charCode
    int charCode = (int) charAtIndex;

    int indexOfChar = name.indexOf(name.charAt(0));

    boolean isEmpty = name.isEmpty();

    String upperCase = name.toUpperCase();

    String lowerCase = name.toLowerCase();

    String trimmedName = name.trim();

    String replacedName = name.replace("Alex", "Bro");

    System.out.println(length);
    System.out.println(charAtIndex);
    System.out.println(charCode);
    System.out.println(indexOfChar);
    System.out.println(isEmpty);
    System.out.println(upperCase);
    System.out.println(lowerCase);
    System.out.println(trimmedName);
    System.out.println(replacedName);
  }
}
