import java.util.Scanner;
public class q4bi {
    public static void main(String[] args) {
        try {
            Integer.parseInt("one");
            System.out.println("one");
        } catch (Exception e) {
            System.out.println("two");
        }
    }
}
