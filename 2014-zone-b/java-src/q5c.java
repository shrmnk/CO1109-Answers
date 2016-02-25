public class q5c {
  public static double averageOfArray(int[][] arr) {
    if(arr.length < 1) return 0;
    int totalElements = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      if(arr[i].length == 0) continue; // Skip if array is empty
      totalElements += arr[i].length;
      for(int j = 0; j < arr[i].length; j++)
        sum += arr[i][j];
    }

    return (double)sum / totalElements;
  }

  public static void main(String[] args) {
    System.out.println(averageOfArray(
      new int[][] {
        {3,3,3,3,3},
        {4,4,4,4,4},
        {},
        {5,5,5,5,5},
        {5,5,5,5,5},
        {}
      }
    ));
  }
}
