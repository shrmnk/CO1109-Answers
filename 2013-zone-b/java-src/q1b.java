class q1b {
    static int smallestElement(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] test = {9, 5, 6, 2, 3, 1, 7, 8, 0};
        System.out.println(smallestElement(test));
    }
}
