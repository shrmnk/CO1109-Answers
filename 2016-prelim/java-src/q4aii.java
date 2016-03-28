import java.util.Scanner;
public class q4aii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number>");
        int x = in.nextInt();
        int i = 0;
        while(i < x) {
            System.out.println(i + 1);
            i += 2;
        }
    }
}
