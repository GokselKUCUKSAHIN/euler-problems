package problems_1_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem10
{
  /*
  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

  Find the sum of all the primes below two million.

  Answer = 142913828922;
   */


  private static int[] sieveOfEratothenes(int max)
  {
    boolean[] isPrime = new boolean[max];
    Arrays.fill(isPrime, true);
    for (int p = 2; p * p < max - 2; p++)
      if (isPrime[p - 2])
        for (int i = p * p; i < max - 2; i += p)
          isPrime[i - 2] = false;
    ArrayList<Integer> primes = new ArrayList<>();
    for (int p = 2; p < max - 2; p++)
      if (isPrime[p - 2])
        primes.add(p);
    return primes.stream().mapToInt(Integer::intValue).toArray();
  }

  public static long eulerProblem10()
  {
    return Arrays.stream(sieveOfEratothenes(2_000_000)).asLongStream().sum();
  }
}
