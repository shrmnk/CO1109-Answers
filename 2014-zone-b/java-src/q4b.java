import java.io.*;
import java.util.*;

public class q4b {
  public static void main(String[] args)  throws Exception{
    Integer o = new Integer(2);
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("mary"));
    out.writeObject(o);
    out.flush();
    out.close();

    ObjectInputStream z = new ObjectInputStream(new FileInputStream("mary"));
    Object x = z.readObject();

    System.out.println(x);
  }
}
