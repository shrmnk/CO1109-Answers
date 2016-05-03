import java.util.Arrays;
class q3c {
    public static void main(String[] args) {
        if(args.length >= 2) {
            if(checkAnagram(args[0], args[1])) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    static boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length())
          return false;

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
