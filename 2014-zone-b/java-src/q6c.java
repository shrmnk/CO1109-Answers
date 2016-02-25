public class q6c {
  public static String reverse(String original) {
    char[] tmp = original.toCharArray();
    char[] reversed = new char[tmp.length];
    for(int i = tmp.length - 1; i >= 0; i--)
      reversed[tmp.length - i - 1] = tmp[i];
    return new String(reversed);
  }

  public static void main(String[] args) {
    System.out.println(reverse("hello"));
  }
}
