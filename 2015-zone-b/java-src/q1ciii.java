public class q1ciii {
  // run this in the command line like
  // java q1ciii 2 1 3
  // output will be "3, 2, 1"
  public static void main(String[] args) {
    int[] argsi = {
      Integer.parseInt(args[0]),
      Integer.parseInt(args[1]),
      Integer.parseInt(args[2])
    };

    int largestIndex = 0;
    for(int i = 0; i < 3; i++)
      if(argsi[i] > argsi[largestIndex])
        largestIndex = i;

    int mid, max;
    if(largestIndex == 0) {
      mid = Math.max(argsi[1], argsi[2]);
      max = Math.min(argsi[1], argsi[2]);
    } else if(largestIndex == 1) {
      mid = Math.max(argsi[0], argsi[2]);
      max = Math.min(argsi[0], argsi[2]);
    } else {
      mid = Math.max(argsi[1], argsi[0]);
      max = Math.min(argsi[1], argsi[0]);
    }
    System.out.println(args[largestIndex] + ", " + mid + ", " + max);
  }
}
