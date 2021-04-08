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

  public static double primeAvg()
  {
    long[] millionPrimes = sieveOfEratothenes(1_000_000);
    // System.out.println(Arrays.toString(millionPrimes));
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

/*

    }

    // Driver Code
    public static void main (String[] args)
    {

        // Function call
        SieveOfEratosthenes();

        System.out.println("5th prime number is " +
                                    primes.get(4));
        System.out.println("16th prime number is " +
                                    primes.get(15));
        System.out.println("1049th prime number is " +
                                    primes.get(1048));
    }
}

// This code is contributed by ihritik
* */

  /*
  class SieveOfEratosthenes {
    void sieveOfEratosthenes(int n)
    {

      boolean prime[] = new boolean[n + 1];
      for (int i = 0; i <= n; i++)
        prime[i] = true;

      for (int p = 2; p * p <= n; p++)
      {
        // If prime[p] is not changed, then it is a
        // prime
        if (prime[p] == true)
        {
          // Update all multiples of p
          for (int i = p * p; i <= n; i += p)
            prime[i] = false;
        }
      }

      // Print all prime numbers
      for (int i = 2; i <= n; i++)
      {
        if (prime[i] == true)
          System.out.print(i + " ");
      }
    }
    */