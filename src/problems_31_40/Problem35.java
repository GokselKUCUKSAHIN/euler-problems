package problems_31_40;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem35
{

  private static final boolean[] primeBools = sieveOfEratothenes(1_000_000);
  private static final int[] allPrimesUnderMillion = getPrimes(primeBools);

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

  private static boolean isPrime(int number)
  {
    if (number < 2)
      return false;
    try
    {
      return primeBools[number - 2];
    }
    catch (IndexOutOfBoundsException ex)
    {
      return false;
    }
  }

  private static String circleLeft(String number)
  {
    final int len = number.length();
    if (len < 2)
      return number;
    String firstChr = number.substring(0, 1);
    String restString = number.substring(1, len);
    return restString + firstChr;
  }

  private static boolean forbittenChar(char chr)
  {
    boolean flag = false;
    switch (chr)
    {
      case '1':
      case '3':
      case '7':
      case '9':
        flag = true;
    }
    return flag;
  }

  private static boolean filter(String num)
  {
    boolean flag = true;
    if (num.length() > 1)
    {
      for (int i = 0; i < num.length() && flag; i++)
      {
        flag = forbittenChar(num.charAt(i));
      }
    }
    return flag;
  }

  private static boolean isCircularPrime(int number)
  {
    String strNum = number + "";
    boolean flag = isPrime(number) && filter(strNum);
    for (int i = 0, limit = strNum.length() - 1; i < limit && flag; i++)
      try
      {
        flag = isPrime(Integer.parseInt(strNum = circleLeft(strNum)));
      }
      catch (Exception x)
      {
        return false;
      }
    return flag;
  }

  public static int eulerProblem35()
  {
    int count = 0;
    for (int prime : allPrimesUnderMillion)
      if (isCircularPrime(prime))
        count++;
    return count;
  }
}
