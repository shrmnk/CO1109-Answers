class pair {
    int first;
    int second;
    pair(int x, int y) {
        first = x;
        second = y;
    }
    public String toString() {
        return "[" + first + "," + second + "]";
    }
    // Note: Changed program's int[] args to String[] args for Java to run
    public static void main(String [] args) {
        pair a = new pair(1,2);
        System.out.println(a);
    }

    // Part c: equality instance method
    boolean equality(pair comparison) {
        return this.first == comparison.first
            && this.second == comparison.second;
    }
}
