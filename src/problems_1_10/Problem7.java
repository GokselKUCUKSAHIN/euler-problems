package problems_1_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem7
{

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