import java.io.*;

public class q1g {
  public static void main(String[] args) throws Exception{
    BufferedReader inone = new BufferedReader(new FileReader(args[0]));
    int t = inone.read();
    while(t != -1) {
      if(t == (int)'c')
        System.out.print('d');
      else if(t == (int)'d')  // We are assuming that there is a typo in the paper
        System.out.print('c');
      else
        System.out.print((char)t);
      t = inone.read();
    }
  }
}
