public class q1a {
  public static void main(String[] args) {
    String tmp = "";
    int i;

    for(i = 1; i < 7; i=i+1) tmp += "8";
    System.out.println("i) " + tmp.length());
    tmp = "";

    i = 0; while(i < 5) { tmp += "*"; i++; }
    System.out.println("ii) " + tmp.length());
    tmp = "";

    for(i = -3; i < 3; i = i+1) tmp+="*";
    System.out.println("iii) " + tmp.length());
    tmp = "";

    for(i = 0; i < 4; i = i+3) tmp += "*";
    System.out.println("iv) " + tmp.length());
    tmp = "";

    i = 0; while(i < 5000) { tmp += "*"; i = i+2; }
    System.out.println("v) " + tmp.length());
    tmp = "";

    /*for(i = 1; i >= 0; i = i+1) tmp += "*";
    System.out.println("vi) " + tmp.length());
    tmp = "";*/
    System.out.println("vi) Infinite");

    for(i = 4; i >= 7; i=i+1) tmp += "*";
    System.out.println("vii) " + tmp.length());
    tmp = "";

    i = 0; while(i > 5000) { tmp += "*"; i = i+2; }
    System.out.println("viii) " + tmp.length());
    tmp = "";

    /*i = 5; while(i >= 5) { tmp += "*"; i = i+1; }
    System.out.println("ix) " + tmp.length());
    tmp = "";*/

    System.out.println("ix) Infinite");

  }

}
