package problems_1_10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem6
{

  /*
  The sum of the squares of the first ten natural numbers is,

  1^2 + 2^2 + 3^2 + 4^2 + 5^2 + ... + 10^2 = 385

  The square of the sum of the first ten natural numbers is,

  (1 + 2 + 3 + 4 + 5 + ... + 10)^2 = 3025

  Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is

  3025 − 385 = 2640

  Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

  Answer = 25164150
  */

  public static int eulerProblem6()
  {
    int[] arr = IntStream.range(1, 101).toArray();
    int sqSum = Arrays.stream(arr).map(x -> x * x).sum();
    int sumSq = (int) Math.pow(Arrays.stream(arr).sum(), 2);
    return sumSq - sqSum;
  }
}
