package problems_1_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem7
{
  /*
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

  What is the 10 001st prime number?

  Answer = 104743
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


  public static int eulerProblem7()
  {
    int[] primes = sieveOfEratothenes(110_000);
    if (primes.length >= 10001)
      return primes[10000];
    else
      return 0;
  }

  private static void adjacentPrimes()
  {
    int[] primesUnderMillion = sieveOfEratothenes(1_000_000);
    for (int i = 0; i < primesUnderMillion.length - 1; i++)
    {
      if (primesUnderMillion[i] + 2 == primesUnderMillion[i + 1])
      {
        System.out.print(primesUnderMillion[i] + 1 + ", ");
      }
    }
  }
}