class q2c {
    static int roll() {
        java.util.Random r = new java.util.Random();
        return r.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int count = 0, consecutiveOnes = 0;
        while (consecutiveOnes < 3) {
            count++;
            if (roll() == 1) {
                consecutiveOnes++;
            } else {
                consecutiveOnes = 0;
            }
        }
        System.out.println(count);
    }
}
