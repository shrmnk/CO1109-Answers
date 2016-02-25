import java.io.*;
import java.util.*;
class q4c {
    // This class will test all the equality instance methods
    public static void main(String[] args) throws Exception {
        if(args.length == 2)
            copy(args[0], args[1]);
        else
            System.out.println("Please provide 2 filenames to copy contents to/from");
    }

    static void copy(String g1, String g2) throws Exception {
        try {
            BufferedReader r = new BufferedReader(new FileReader(g2));
            BufferedWriter w = new BufferedWriter(new FileWriter(g1));
            int t = r.read();
            while(t != -1) {
                w.append((char)t);
                t = r.read();
            }
            w.close();
            r.close();
        } catch(Exception e) {
            System.out.println("Error - The file " + g2 + " does not exist!");
        }
    }
}
