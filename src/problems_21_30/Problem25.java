package problems_21_30;

import java.math.BigInteger;
import java.util.HashMap;

public class Problem25
{

  /*
  The Fibonacci sequence is defined by the recurrence relation:

  Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
  Hence the first 12 terms will be:

  F1 = 1
  F2 = 1
  F3 = 2
  F4 = 3
  F5 = 5
  F6 = 8
  F7 = 13
  F8 = 21
  F9 = 34
  F10 = 55
  F11 = 89
  F12 = 144
  The 12th term, F12, is the first term to contain three digits.

  What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

  Answer = 4782
   */

  static HashMap<Integer, BigInteger> memo = new HashMap<>();

  private static BigInteger fibonacci(int n)
  {
    if (n < 2)
      return BigInteger.valueOf(1);
    final BigInteger current = memo.get(n);
    if (current != null)
      return current;
    BigInteger fib = fibonacci(n - 2).add(fibonacci(n - 1));
    memo.put(n, fib);
    return fib;
  }

  public static int eulerProblem25()
  {
    for (int i = 0; ; i++)
    {
      BigInteger c = fibonacci(i);
      if (c.toString().length() >= 1000)
        return i + 1;
    }
  }
}