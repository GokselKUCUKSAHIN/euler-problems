package problems_11_20;

import java.math.BigInteger;

public class Problem16
{
  /*
  2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

  What is the sum of the digits of the number 2^1000?


  Answer = 1366
  */

  public static long eulerProblem16()
  {
    long sum = 0;
    for (char ch : BigInteger.valueOf(2).pow(1000).toString().toCharArray())
    {
      sum += Character.getNumericValue(ch);
    }
    return sum;
  }
}