import java.io.*;

public class q5d {
  public static void main(String[] args) throws Exception{
    BufferedReader inone = new BufferedReader(new FileReader(args[0]));
    int t = inone.read();
    while(t != -1) {
      if(t == (int)'a')
        System.out.print('x');
      else if(t == (int)'x')  // We are assuming that there is a typo in the paper
        System.out.print('a');
      else
        System.out.print((char)t);
      t = inone.read();
    }
  }
}
