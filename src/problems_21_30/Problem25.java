package problems_21_30;

import java.math.BigInteger;
import java.util.HashMap;

public class Problem25
{

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

  public static int eulerProblem25() {
    for (int i = 0; ; i++) {
      BigInteger c = fibonacci(i);
      if (c.toString().length() >= 1000)
        return i + 1;
    }
  }
}
