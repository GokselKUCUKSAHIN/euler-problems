package problems_31_40;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem37
{

  /*
  The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

  Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

  NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

  Answer = 748317
   */

  private static final boolean[] primeBools = sieveOfEratothenes(10_000_000);
  private static final int[] allPrimesUnderTenMillion = getPrimes(primeBools);

  private static int[] getPrimes(boolean[] primeBool)
  {
    ArrayList<Integer> primes = new ArrayList<>();
    for (int p = 2; p < primeBool.length - 2; p++)
      if (primeBool[p - 2])
        primes.add(p);
    return primes.stream().mapToInt(Integer::intValue).toArray();
  }

  private static boolean[] sieveOfEratothenes(int max)
  {
    boolean[] isPrime = new boolean[max];
    Arrays.fill(isPrime, true);
    for (int p = 2; p * p < max - 2; p++)
      if (isPrime[p - 2])
        for (int i = p * p; i < max - 2; i += p)
          isPrime[i - 2] = false;
    return isPrime;
  }

  private static int parse(String num)
  {
    return Integer.parseInt(num);
  }

  private static boolean isPrime(int number)
  {
    return number < 2 ? false : primeBools[number - 2];
  }

  private static String truncateLeft(String numStr)
  {
    return numStr.length() > 1 ? numStr.substring(1, numStr.length()) : numStr;
  }

  private static String truncateRight(String numStr)
  {
    return numStr.length() > 1 ? numStr.substring(0, numStr.length() - 1) : numStr;
  }

  private static boolean isLeftTruncatePrime(int prime)
  {
    String primeStr = prime + "";
    for (int i = 0, len = primeStr.length(); i < len - 1; i++)
    {
      int potentialPrime = parse(primeStr = truncateLeft(primeStr));
      if (!isPrime(potentialPrime))
      {
        return false;
      }
    }
    return true;
  }

  private static boolean isRightTruncatePrime(int prime)
  {
    String primeStr = prime + "";
    for (int i = 0, len = primeStr.length(); i < len - 1; i++)
    {
      int potentialPrime = parse(primeStr = truncateRight(primeStr));
      if (!isPrime(potentialPrime))
      {
        return false;
      }
    }
    return true;
  }

  public static long eulerProblem37()
  {
    long sum = 0;
    for (int i = 4, count = 0; i < allPrimesUnderTenMillion.length && count < 11; i++)
    {
      int currentPrime = allPrimesUnderTenMillion[i];
      if (isLeftTruncatePrime(currentPrime) && isRightTruncatePrime(currentPrime))
      {
        sum += currentPrime;
        count++;
      }
    }
    return sum;
  }
}
