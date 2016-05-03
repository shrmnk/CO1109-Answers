import java.util.Vector;

class q1c {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("10characters");
        v.add("aaaaaaaaaa");
        v.add("two");
        v.add("e");
        v.add("f");

        Vector<String> shortest = getShortestStrings(v);

        System.out.println("The shortest strings are: ");
        for(int i = 0; i < shortest.size(); i++) {
            System.out.println((i + 1) + " - " + shortest.get(i));
        }
    }

    static Vector<String> getShortestStrings(Vector<String> v) {
        Vector<String> ret = new Vector<>();
        int shortest = v.get(0).length();

        // This loop goes through the given Vector to find the length of the
        // Shortest String
        for (int i = 1; i < v.size(); i++) {
            if (shortest > v.get(i).length()) {
                shortest = v.get(i).length();
            }
        }
        // The following loop looks through the vector to collect
        // elements whose length == shortest into the Vector ret
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).length() == shortest) {
                ret.add(v.get(i));
            }
        }

        return ret;
    }
}
