class q4a {
    // This class will test all the equality instance methods
    public static void main(String[] args) {
        int x, y, z;

        System.out.println("Part i) ");
        x = 15;
        System.out.println(
            x == 15
        );
        x = 1337;
        System.out.println(
            x == 15
        );


        System.out.println("Part ii) ");
        x = 7;
        System.out.println(
            x == 7 || x == 91
        );
        x = 91;
        System.out.println(
            x == 7 || x == 91
        );
        x = 1337;
        System.out.println(
            x == 7 || x == 91
        );

        System.out.println("Part iii) ");
        x = 1; y = 2; z = 2;
        System.out.println(
            x == 1 && y == 2 && z % 2 == 0
        );
        x = 1; y = 2; z = 1;
        System.out.println(
            x == 1 && y == 2 && z % 2 == 0
        );

        System.out.println("Part iv) ");
        x = y = z = 1;
        System.out.println(
            !(x == y || x == z || y == z)
        );
        x = y = 2;
        System.out.println(
            !(x == y || x == z || y == z)
        );
        x = 1; y = 2; z = 3;
        System.out.println(
            !(x == y || x == z || y == z)
        );
    }
}
