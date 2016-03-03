public class q3b {
    public static void main(String[] args) {
        String[] s = {
            "This",
            "is",
            "SPARTA"
        };
        System.out.print(maxLength(s));
    }

    static int maxLength(String[] s) {
        int max = s[0].length();
        for(int i = 1; i < s.length; i++)
            if(s[i].length() > max)
                max = s[i].length();
        return max;
    }
}
