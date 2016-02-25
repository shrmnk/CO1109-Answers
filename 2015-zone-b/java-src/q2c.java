public class q2c {
  static int shortestLength(String[] arr) {
    if(arr.length == 0) return 0;
    int shortLength = arr[0].length();

    for(int i = 1; i < arr.length; i++)
      if(shortLength > arr[i].length())
        shortLength = arr[i].length();
    return shortLength;
  }
  public static void main(String[] args) {
    System.out.println(shortestLength(new String[]{}));
    System.out.println(shortestLength(new String[]{ "asd", "jk", "qwerty", "zzzzz" }));
  }
}
