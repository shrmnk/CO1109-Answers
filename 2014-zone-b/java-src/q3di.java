import java.util.Vector;
public class q3di {
  public static void main(String[] args) {
    Vector<String> str = new Vector<>();
    str.addElement(new String("z"));
    str.addElement(new String("g"));
    str.addElement(new String("w"));
    str.addElement(new String("a"));
    str.addElement(new String("d"));
    str.addElement(new String("e"));
    str.addElement(new String("f"));
    str.addElement(new String("t"));
    str.addElement(new String("v"));

    new vectorsort(new alphabetic()).sort(str);

    for(int i = 0 ; i < str.size(); i++) {
      System.out.println("#" + i + ": " + str.elementAt(i).toString());
    }
    /*
    System.out.println(alphabetic.compare("z", "b") ? "Before" : "After");
    System.out.println(Shorter.compare("asdf", "movie") ? "Shorter" : "Longer");
    */
  }
}
