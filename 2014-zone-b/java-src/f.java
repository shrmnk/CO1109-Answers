import java.io.*;

public class f {
  public static void g(String s) throws Exception {
    BufferedReader inone = new BufferedReader(new FileReader(s));
    int t = inone.read();
    while(t != -1) {
      System.out.print((char)t);
      t = inone.read();
    }
  }
  public static void main(String[] args) throws Exception{g(args[0]);}
}
