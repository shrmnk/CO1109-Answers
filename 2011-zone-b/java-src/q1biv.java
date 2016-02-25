class q1biv {
    public static boolean l(int[] a, int size, int thing) {
        int i;
        // Remove comments and semicolon to see how the loop works
        for(i = 0; i < size && a[i] != thing; i++);/*
            System.out.println(a[i] + " != " + thing + ".");
        System.out.println("Final: " + i + " of " + size);*/
        return (a[i-1] == thing);
    }

    public static void main(String[] args) {
        int[] testArr = {5, 4, 3, 2, 1};
        // Check if element 0 is in the given array (false)
        System.out.println(
        l(testArr, testArr.length, 0)
        );

        // This one should give true if it were searching for
        // the element 3 in the array.
        System.out.println(
        l(testArr, testArr.length, 3)
        );
    }
}
