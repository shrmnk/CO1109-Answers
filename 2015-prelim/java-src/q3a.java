public class q3a {
    public static void main(String[] args) {
        // Spaces are represented by dashes (-) to maximise clarity
        for(int i = 1; i < 10; i += 2) {
            for(int j = 0; j < 9 - i / 2; j++)
                System.out.print("-");
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(int i = 7; i > 0; i -= 2) {
            for(int j = 0; j < 9 - i / 2; j++)
                System.out.print("-");
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
