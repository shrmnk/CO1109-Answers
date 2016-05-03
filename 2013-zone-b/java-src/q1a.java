class q1a {
    public static void main(String[] args) {
        int i = 0, count = 0;
        for(i = 1; i < 13; i = i + 1) count++;
        System.out.println("i) " + count);
        count = 0;

        i = 1;
        while(i < 7) { count++; i++; }
        System.out.println("ii) " + count);
        count = 0;

        for(i = -2; i < 4; i = i + 1) count++;
        System.out.println("iii) " + count);
        count = 0;

        for(i = 0; i < 77; i = i+2) count++;
        System.out.println("iv) " + count);
        count = 0;

        i = 0;
        while(i > 40) { count++; i = i + 2; }
        System.out.println("v) " + count);
        count = 0;

        // vi will result in infinity
        //i = 5;
        //while(i < 21) { count++; i = i - 1; }
        //System.out.println("vi) " + count);
        //count = 0;
        System.out.println("vi) infinity");

        i = 0;
        while(i < 400) { count++; i = i + 10; }
        System.out.println("vii) " + count);
        count = 0;

        // viii will result in infinity
        //for(i = 1; i >= 1; i = i + 2) count++;
        //System.out.println("viii) " + count);
        //count = 0;
        System.out.println("viii) infinity");

        for(i = 4; i >= 8 && i % 2 == 0; i = i + 1) count++;
        System.out.println("iv) " + count);
        count = 0;
    }

}
