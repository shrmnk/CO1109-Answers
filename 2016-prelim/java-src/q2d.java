public class q2d {
    public static void main(String[] args) {
        int a = 3, b = 2, c = 1;
        System.out.println(minOf2(a, b));
        System.out.println(minOf3(a, b, c));
    }

    static int minOf2(int x, int y) {
        return x < y ? x : y;
    }

    static int minOf3(int x, int y, int z) {
        return minOf2(x, minOf2(y, z));
    }
}
