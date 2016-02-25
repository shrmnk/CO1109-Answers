class q4b {
  int syr(int n) {
    System.out.print(n + " ");
    if(n == 1) {
      return 1;
    }
    if(n % 2 > 0) {
      return syr(n * 3 + 1);
    }
    return syr(n/2);
  }

  public static void main(String[] args) {
    q4b go = new q4b();
    go.syr(14);
  }
}
