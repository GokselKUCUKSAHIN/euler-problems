package problems_11_20;

import java.math.BigInteger;

public class Problem20
{

    /*
    n! means n × (n − 1) × ... × 3 × 2 × 1

    For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
    and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

    Find the sum of the digits in the number 100!

    Answer = 648
     */

  private static int sumOfDigits(BigInteger number)
  {
    String numStr = number.toString();
    int sum = 0;
    for (int i = 0; i < numStr.length(); i++)
    {
      char ch = numStr.charAt(i);
      sum += Character.getNumericValue(ch);
    }
    return sum;
  }

  private static BigInteger factorial(BigInteger f)
  {
    if (f.compareTo(BigInteger.valueOf(2)) == -1)
    {
      return f;
    }
    return f.multiply(factorial(f.subtract(BigInteger.valueOf(1))));
  }

  public static int eulerProblem20()
  {
    BigInteger hunderedFactorial = factorial(BigInteger.valueOf(100));
    return sumOfDigits(hunderedFactorial);
  }
}