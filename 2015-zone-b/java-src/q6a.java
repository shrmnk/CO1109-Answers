public class q6a {
  public static void main(String[] args) {
    try {
      Integer.parseInt("apple");
      System.out.println("orange");
    } catch (Exception e) {
      System.out.println("peach");
    }
  }
}
