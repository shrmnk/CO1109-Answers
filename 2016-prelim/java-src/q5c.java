import java.io.*;
import java.util.Scanner;
public class q5c {
    public static void main(String[] args) throws Exception {
        if(args.length == 2)
            copy(args[0], args[1]);
        else
            System.out.println("Please specify files!");
    }

    static void copy(String g1, String g2) throws Exception {
        boolean g1Exists = true;
        try {
            FileReader checkFile = new FileReader(g1);
        } catch (Exception e) {
            g1Exists = false;
            System.out.println(g1 + " does not exist!");
        }

        if(g1Exists) {
            Scanner t = new Scanner(new FileReader(g2));
            FileWriter w = new FileWriter(g1);
            BufferedWriter output = new BufferedWriter(w);
            while(t.hasNext()) {
                output.append(t.nextLine() + "\n");
            }
            output.close();
        }

    }
}
