class q5a {
  public static void main (String args[]) {
    for(int i = 0; i < 5; i++) {
      for(int j = i; j < 5; j++) System.out.print('*');
      System.out.println();
    }
    for(int i = 0; i < 5; i++) {
      for(int j = 5-i-1; j < 5; j++) System.out.print('*');
      System.out.println();
    }
  }
}
