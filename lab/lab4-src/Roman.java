/*
Lab 4 Question 10
*/
import java.util.Scanner;

class Roman {
    // Using String here because of the convenient .indexOf() method
    static final String numerals = "mdclxvi";
    // The index of the character above correlates with the index here to get the value
    static final int[] numeralValue = {1000, 500, 100, 50, 10, 5, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        int numericValue = 0;

        while(true) {
            input = "";
            numericValue = 0;
            while(input.isEmpty()) {
                System.out.print("Please enter a roman numeral > ");
                input = in.nextLine().toLowerCase();

                // Validate roman numeral input
                for(int i = 0; i < input.length(); i++)
                    if(getValue(input.charAt(i)) == 0) {
                        input = "";
                        System.out.println("Please enter a valid roman numeral!");
                    }
            }
            if(input.length() == 1) numericValue = getValue(input.charAt(0));
            else {
                // Loop through input to check for pairs
                for(int i = 1; i < input.length(); i++) {
                    if(displacement(input.charAt(i-1), input.charAt(i)) > 0) {
                        // If a pair is found where the left value is lower than the right, then,
                        // 1. Calculate the value by taking right value minus left value
                        // 2. Add result to final sum numericValue
                        //System.out.println("Found pair: " + input.charAt(i-1) + input.charAt(i) + " = " + (getValue(input.charAt(i)) - getValue(input.charAt(i-1))));
                        numericValue += getValue(input.charAt(i)) - getValue(input.charAt(i-1));
                        // 3. Remove pair from input String
                        input = input.substring(0, i-1) + input.substring(i+1);
                        // 4. Start loop again from the start to find more pairs
                        i = 1;
                    }
                }
                // Finally, add all the remaining roman numerals' values to the sum
                for(int i = 0; i < input.length(); i++)
                    numericValue += getValue(input.charAt(i));
            }
            System.out.println("Numeric Value: " + numericValue);

            System.out.print("Again? (y/n) > ");
            if(in.nextLine().toLowerCase().startsWith("n")) break;
        }
    }

    static int getValue(char numeral) {
        // Return a 0 if the roman numeral was not recognised
        try {
            return numeralValue[numerals.indexOf(numeral)];
        } catch(Exception e) {}
        return 0;
    }

    static int displacement(char x, char y) {
        // Assuming both x and y are valid, displacement will return how many indices x differs from y by.
        // A 0 indicates they are identical, while a positive number indicates that x is larger than y, and vice versa
        return numerals.indexOf(x) - numerals.indexOf(y);
    }
}
