import java.util.Scanner;
class q3b {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int j = 0;
    while(j < 265) {
      int i = 0;
      while(i < 100) {
        System.out.print("*");
        i++;
      }
      System.out.println();
      j++;
    }
  }
}
