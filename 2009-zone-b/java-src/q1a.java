class q1a {
    public static void main(String[] args) {
        int i;
        String tmp = "";

        for(i = 0; i < 6; i=i+1) tmp += "*";
        System.out.println("i) " + tmp.length());
        tmp = "";

        i = 1; while(i<4){ tmp += "*"; i++; }
        System.out.println("ii) " + tmp.length());
        tmp = "";

        for(i = -1; i < 4; i = i+1) tmp += "*";
        System.out.println("iii) " + tmp.length());
        tmp = "";

        for(i = 0; i < 4; i = i+2) tmp += "*";
        System.out.println("iv) " + tmp.length());
        tmp = "";

        i = 0; while(i<4000) { tmp += "*"; i=i+2;}
        System.out.println("v) " + tmp.length());
        tmp = "";

        // Part 6 is infinite
        System.out.println("vi) Infinite");
        /*for(i = 0; i>=-1; i=i+1) tmp += "*";
        System.out.println("vi) " + tmp.length());
        tmp = "";*/

        for(i = 5; i>= 7; i=i+1) tmp += "*";
        System.out.println("vii) " + tmp.length());
        tmp = "";

        i = 0; while(i>1000){tmp += "*";i=i+2;}
        System.out.println("viii) " + tmp.length());
        tmp = "";

        i = 4; while(i>=2) { tmp += "*"; i=i+1; }
        System.out.println("ix) " + tmp.length());
        tmp = "";
    }
}
