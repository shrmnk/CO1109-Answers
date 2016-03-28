import java.util.Scanner;
public class q4ai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number>");
        int x = in.nextInt();
        for(int i = 0; i < x; i += 2)
            System.out.println(i + 1);
    }
}
