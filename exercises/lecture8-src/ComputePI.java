
public class ComputePI {
    public static void main(String[] args) {
        // Modify the below variable to change the number of terms to compute
        // The more the number of terms, the more accurate it will be
        final int NUM_OF_TERMS = 1000;
        double result = 0.0;

        // We will compute the value inside the bracket first
        // We use double as the type for the counter for the calculations later
        for (double i = 1; i <= NUM_OF_TERMS; i++) {
            // The odd terms are added while even terms are subtracted
            // Remember that odd numbers use the formula (2n-1) or (2n+1)
            // We use (2n-1) so that the 1st term equates to 1
            if(i % 2 == 1) {
                result += 1 / (2*i - 1);
            } else {
                result -= 1 / (2*i - 1);
            }
        }

        // Finally, compute the value multiplied by 4.
        result *= 4;

        System.out.println("JDK Value: " + Math.PI);
        System.out.println("Calculated Value: " + result);
        System.out.println("Difference: " + (Math.PI - result));
	}
}
