class q3c {
    // This class will test all the equality instance methods
    public static void main(String[] args) {
        pair p1 = new pair(1,2);
        triple t1 = new triple(1,2,3);
        quadruple q1 = new quadruple(1,2,3,4);

        pair p2 = new pair(1,2);
        triple t2 = new triple(1,2,3);
        quadruple q2 = new quadruple(1,2,3,4);

        pair p3 = new pair(2,1);
        triple t3 = new triple(3,2,1);
        quadruple q3 = new quadruple(4,3,2,1);

        System.out.println("p1 vs p2: " + p1.equality(p2));
        System.out.println("p1 vs p3: " + p1.equality(p3));

        System.out.println("t1 vs t2: " + t1.equality(t2));
        System.out.println("t1 vs t3: " + t1.equality(t3));

        System.out.println("q1 vs q2: " + q1.equality(q2));
        System.out.println("q1 vs q3: " + q1.equality(q3));
    }
}
