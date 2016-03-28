public class q2c {
    public static void main(String[] args) {
        replace("The UK should not be written as uk", "UK", "United Kingdom");
    }

    static void replace(String input, String seed, String replacement) {
        boolean done = false;
        while(!done) {
            done = true;
            if(input.indexOf(seed) >= 0) {
                input = input.substring(0, input.indexOf(seed)) + replacement
                 + input.substring(input.indexOf(seed) + seed.length());
                 done = false;
            }
        }
        System.out.print(input);
    }
}
