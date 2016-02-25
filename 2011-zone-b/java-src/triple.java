class triple extends pair {
    int third;
    public triple(int x, int y, int z) {
        super(x, y);
        third = z;
    }

    public String toString() {
        return "[" + third + "]" + super.toString();
    }
    // Note: Changed program's int[] args to String[] args for Java to run
    public static void main(String [] args) {
        triple z = new triple(1,2,3);
        System.out.println(z);
    }

    // Part c: equality instance method
    boolean equality(triple comparison) {
        return this.first == comparison.first
            && this.second == comparison.second
            && this.third == comparison.third;
    }
}
