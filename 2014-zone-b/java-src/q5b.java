public class q5b {
  public static int smallestElement(int[] arr) {
    int smallest = arr[0];
    for (int i = 0; i < arr.length; i++)
      if(smallest > arr[i])
        smallest = arr[i];
    return smallest;
  }

  public static void main(String[] args) {
    System.out.println(smallestElement(new int[]{ 1,2,3,4,5,65,9,99,3434}));
  }
}
