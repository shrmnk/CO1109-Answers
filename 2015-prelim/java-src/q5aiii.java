public class q5aiii {
    public static void main(String[] args) {
        String[] animalism = {
            new String("four"),
            new String("legs"),
            new String("good"),
            new String("two"),
            new String("legs"),
            new String("bad"),
        };
        int count = countOccurrences(animalism, "legs");
        System.out.println("Number of occurrences: " + count);
    }

    public static int countOccurrences(String[] wordArray, String word) {
        int result;
        result = 0;
        for(int i = 0; i <wordArray.length; i++) {
            if(wordArray[i] == word) {
            // Below is the correct version of String objects
            //if(wordArray[i].equals(word) ) {
                result = result + 1;
            }
        }
        return result;
    }
}
