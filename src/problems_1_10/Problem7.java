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

  private static long[] sieveOfEratothenes(int max)
  {
    boolean[] isPrime = new boolean[max];
    Arrays.fill(isPrime, true);
    for (int p = 2; p * p < max - 2; p++)
      if (isPrime[p - 2])
        for (int i = p * p; i < max - 2; i += p)
          isPrime[i - 2] = false;
    ArrayList<Long> primes = new ArrayList<>();
    for (long p = 2; p < max - 2; p++)
      if (isPrime[(int) (p - 2)])
        primes.add(p);
    return primes.stream().mapToLong(Long::longValue).toArray();
  }

  private static double primeAvg()
  {
    long[] millionPrimes = sieveOfEratothenes(1_000_000);
    double avg = Arrays.stream(millionPrimes).sum() / (double) millionPrimes.length;
    System.out.println(millionPrimes.length);
    System.out.println(avg);
    return avg;
  }

  public static long eulerProblem7()
  {
    long[] primes = sieveOfEratothenes(110_000);
    if (primes.length >= 10001)
      return primes[10000];
    else
      return 0;
  }
}