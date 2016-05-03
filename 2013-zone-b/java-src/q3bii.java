class q3bii {
    int f(int n)
    {
        if (n==0) return 2;
        else return n*f(n-1);
    }
    public static void main(String[] args)
    {
        System.out.println(f(3));
    }
}
