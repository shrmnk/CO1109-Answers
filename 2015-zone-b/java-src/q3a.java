import java.util.Scanner;
class q3a {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Width>");
    int x = in.nextInt();
    for(int j = 0; j < x; j++) {
      for(int i = 0; i < x; i++) System.out.print("*");
      System.out.println();
    }

  }
}
