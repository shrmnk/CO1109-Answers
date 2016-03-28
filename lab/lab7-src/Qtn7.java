/**
 * Payroll System
 */

import java.util.Scanner;
public class Qtn7 {
    private static final Qtn7Staff[] staff = new Qtn7Staff[10];

    public static void main(String[] args) {
        System.out.println("Payroll System");

        staff[0] = new Qtn7Staff("George Michael", true);
        staff[1] = new Qtn7Staff("Janet Tan", false);
        staff[2] = new Qtn7Staff("George Clooney", true);
        staff[3] = new Qtn7Staff("George Owens", true);
        staff[4] = new Qtn7Staff("John Doe", false);
        staff[5] = new Qtn7Staff("George Jungle", true);
        staff[6] = new Qtn7Staff("George Lumberjack", true);
        staff[7] = new Qtn7Staff("George Tan", true);

        Scanner in = new Scanner(System.in);
        for(int i = 0; i < staff.length; i++) {
            if(staff[i] == null) continue;
            boolean updated = false;
            while(!updated) {
                try {
                    System.out.print("Please enter the number of times " + staff[i].getName() + " was late: ");
                    updated = staff[i].setCountLate(in.nextInt());
                } catch (Exception e) {}
                if(!updated) System.out.println("Please enter 0 or a positive integer!");
            }
            updated = false;
            while(!updated) {
                try {
                    System.out.print("Please enter the number of times " + staff[i].getName() + " took MC: ");
                    updated = staff[i].setCountMC(in.nextInt());
                } catch (Exception e) {}
                if(!updated) System.out.println("Please enter 0 or a positive integer!");
            }
        }
        
        for(int i = 0; i < staff.length; i++) {
            if(staff[i] == null) continue;
            System.out.println(staff[i].toString());
            System.out.println("------");
        }
    }
}
