class quadruple {
    pair firstPair, secondPair;
    public quadruple(int x1, int y1, int x2, int y2) {
        firstPair = new pair(x1, y1);
        secondPair = new pair(x2, y2);
    }
    public String toString() {
        return firstPair.toString() + "," + secondPair.toString();
    }
    public static void main(String [] args) {
        System.out.println(new quadruple(1, 2, 3, 4));
    }

    // Part c: equality instance method
    boolean equality(quadruple comparison) {
        return this.firstPair.equality(comparison.firstPair)
            && this.secondPair.equality(comparison.secondPair);
    }
}
