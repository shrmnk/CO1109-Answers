public class q2ci {
    public static void main(String[] args) {
        int[] a = new int[1];
        a[0] = 1;
        p(a);
        System.out.println(a[0]);
    }
    static void p(int[] m) {
        m[0] = 5;
    }
}
