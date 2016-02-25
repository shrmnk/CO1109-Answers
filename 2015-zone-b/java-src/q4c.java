class q4c {
  // I'll be honest - I had no clue how to do this without googling.
  // Exponentiation by squaring
  // https://en.wikipedia.org/wiki/Exponentiation_by_squaring
  int exponentiation(int x, int n) {
    if(n == 1) return x;
    if(n == 2) return x * x;

    if(x % 2 > 0)
      return x * exponentiation(exponentiation(x, (n - 1) / 2), 2);
    return exponentiation(exponentiation(x, n / 2), 2);
  }

  public static void main(String[] args) {
    q4c go = new q4c();
    System.out.println("2^4 = " + go.exponentiation(2, 4));
  }
}
