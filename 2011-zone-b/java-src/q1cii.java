import java.util.Vector;

class q1cii {

    public static String longestString(Vector<String> v) {
        int longestIndex = 0;
        for(int i = 1; i < v.size(); i++)
            if(v.elementAt(i).length() > v.elementAt(longestIndex).length())
                longestIndex = i;

        return v.elementAt(longestIndex);
    }

    public static void main(String[] args) {
        Vector<String> test = new Vector<String>();
        test.add(new String("What"));
        test.add(new String("is"));
        test.add(new String("love"));
        test.add(new String("baby"));
        test.add(new String("don't"));
        test.add(new String("hurt"));
        test.add(new String("me"));

        System.out.println(longestString(test));

        test.add(new String("Sandstorm"));
        System.out.println(longestString(test));

    }
}
