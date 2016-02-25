import java.io.*;
class q5a {
  public static void bling(String s) throws Exception {
    BufferedReader inone = new BufferedReader(new FileReader(s));
    int t = inone.read();
    while(t != -1) {
      System.out.print((char)t);
      t = inone.read();
    }

  }

  public static void main(String[] args) throws Exception {
    bling(args[0]);
  }
}
