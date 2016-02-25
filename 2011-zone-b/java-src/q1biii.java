class q3biii {
    public static void main(String[] args) {
        int[] c = { 9, 8, 7, 6};
        int i = 0;
        int j = 2;

        int t = c[i];   // 9
        c[i] = c[j];    // 7
        c[j] = t;       // 9

        System.out.println(t);
        System.out.println(c[i]);
        System.out.println(c[j]);
    }
}
