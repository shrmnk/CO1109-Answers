public class q3c {
    public static void main(String[] args) {
        int[][] arr = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9, 10, 12, 12, 13 }
        };
        avg2D(arr);
    }

    static void avg2D(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int z = 0; z < arr[i].length; z++)
                sum += arr[i][z];
            System.out.println(sum / (double) arr[i].length);
            sum = 0;
        }
    }
}
