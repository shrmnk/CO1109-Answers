public class q4bii {
    public static void main(String[] args) {
        System.out.println(h(124));
    }

    static int h(int n) {
        if(n == 100) return 100;
        else return h(n-1);
    }
}
