public class q2c {
    public static void main(String[] args) {
        System.out.println(replace("The UK should not be written as uk", "UK", "United Kingdom"));
    }

    // String.indexOf Method
    /*static String replace(String input, String seed, String replacement) {
        boolean done = false;
        while(!done) {
            done = true;
            if(input.indexOf(seed) >= 0) {
                input = input.substring(0, input.indexOf(seed)) + replacement
                 + input.substring(input.indexOf(seed) + seed.length());
                 done = false;
            }
        }
        return input;
    }*/

    static String replace(String input, String seed, String replacement) {
        // Check if the string contains the seed
        if(!input.contains(seed))
            return input;

        // Get the location of the seed
        return input.substring(0, input.indexOf(seed)) + replacement + input.substring(input.indexOf(seed) + seed.length());
    }
}
