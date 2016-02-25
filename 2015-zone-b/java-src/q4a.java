class q4a {
  boolean isOdd(int n) {
    return (n%2) > 0;
  }

  public static void main(String[] args) {
    q4a go = new q4a();
    System.out.println(go.isOdd(1000) ? "Odd" : "Even");
    System.out.println();
    System.out.println(go.isOdd(777) ? "Odd" : "Even");
  }
}
