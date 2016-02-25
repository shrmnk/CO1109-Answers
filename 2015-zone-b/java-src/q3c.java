class q3c {
  public void rightTriangle(int n) {
    for(int i =0; i < n; i++) {
      for(int j = 0; j < i; j++)
        System.out.print(" ");
      for(int k = 0; k < (n-i); k++)
        System.out.print("*");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    q3c go = new q3c();
    go.rightTriangle(5);
    System.out.println();
    go.rightTriangle(4);
  }
}
