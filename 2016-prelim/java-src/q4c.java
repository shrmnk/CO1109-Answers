public class q4bc {
    public static void main(String[] args) {
        System.out.println("124: has " + count7(124) + " 'n's");
        System.out.println("717: has " + count7(717) + " 'n's");
        System.out.println("7777: has " + count7(7777) + " 'n's");
    }

    static int count7(int n) {
        if(n == 0) return 0;
        else if(n % 10 == 7)
            return 1 + count7(n / 10);
        return count7(n/10);
    }
}
