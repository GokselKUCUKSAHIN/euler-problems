package problems_1_10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem6
{

  public static int eulerProlem6()
  {
    int[] arr = IntStream.range(1, 101).toArray();
    int sqSum = Arrays.stream(arr).map(x -> x * x).sum();
    int sumSq = (int) Math.pow(Arrays.stream(arr).sum(), 2);
    return sumSq - sqSum;
  }
}
