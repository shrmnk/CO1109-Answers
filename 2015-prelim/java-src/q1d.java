import java.util.Vector;

public class q1d {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));

        System.out.println(product(v));
    }

    static int product(Vector v) {
        int sum = 0;
        for(int i = 0; i < v.size(); i++)
            sum += (int)v.elementAt(i);

        return sum;
    }
}
