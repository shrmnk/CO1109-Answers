public class q4d {
  public static int power(int m, int n) {
    if(n == 0) return 1;
    if(n == 1) return m;
    if(n < 0) return 0; // Because this is an int method, any fraction will always return 0
    n -= 1;

    int result = m;
    for(int i = n; i > 0; i--)
      result *= m;
    return result;
  }

  public static void main(String[] args) {
    System.out.println(power(2, 8));
  }
}
