/* Question 4c in 2008 Zone B paper
Write a complete Java program that checks whether the String entered by the user on the command line is in the file called 'dictionary'.
This file contains one word per line. If it finds the word entered by the user, the program prints 'found'.
Otherwise it prints 'not found'.
Your program should be as efficient as you can make it.
*/

import java.io.*
import java.util.Scanner;

public class q4c {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("dictionary"));

        while(in.hasNextLine()) {
            if(args[0].equals(in.nextLine())) {
                System.out.print("found");
                break;
            }
        }
        // Has reached end of the dictionary
        System.out.print("not found");
    }
}
