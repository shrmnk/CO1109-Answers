public class q4c {
  public static int mult(int n, int m) {
    if(m > 0)
      return n + mult(n, m-1);
    else
      return 0;
  }
  
  public static void main(String[] args) {
    System.out.println(mult(2, 10));
  }
}
