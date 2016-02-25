import java.util.Scanner;
class q2b {
  public static void main(String[] args) {
    int largest = 0;
    int [] a;
    a = new int[1000];
    int i;


    Scanner in = new Scanner(System.in);
    System.out.println("Enter some numbers terminated by -1");
    /** This is the original block given
    boolean more = true;
    for(i = 0; more; i++) {
      int x = in.nextInt();
      a[i] = x;
      if(x == -1) more = false; // if x equals -1 set more to false
    }
    **/

    /** I replaced the loop with simulated 1001 inputs here: **/
    java.util.Random r = new java.util.Random();
    for(i = 0; i < (a.length + 2); i++) {
      System.out.println("#" + (i+1) + ": " + (a[i] = r.nextInt(65536)));
    }
    /** Note that the program crashes at the 1001th input because of array index out of bounds **/

    for(int j = 0; j < i; j++) {
      if(i == 0) largest = a[0];
      else if(a[j] > largest) largest = a[j];
    }

    System.out.println("The largest is " + largest);

  }
}
