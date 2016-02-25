public class q6d {
  public static int roll() {
    java.util.Random r = new java.util.Random();
    return r.nextInt(6) + 1;
  }

  public static void main(String[] args) {
    int consecutive = 0, i = 1;
    for(i = 1; consecutive != 3; i++) {
      if(roll() == 5)
        consecutive++;
      else
        consecutive = 0;
    }
    System.out.println(i);
  }
}
