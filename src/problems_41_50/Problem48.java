package problems_41_50;

import java.math.BigInteger;

public class Problem48
{

  /*
  The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.

  Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.

  Answer = 9110846700

   */

  private static BigInteger selfPower(int number)
  {
    return BigInteger.valueOf(number).pow(number);
  }

  private static long getLastTenDigit(String numStr)
  {
    return Long.parseLong(numStr.substring(numStr.length() - 10, numStr.length()));
  }

  public static long eulerProblem48()
  {
    BigInteger sum = BigInteger.valueOf(0);
    for (int i = 1; i <= 1000; i++)
      sum = sum.add(selfPower(i));
    return getLastTenDigit(sum.toString());
  }
}
