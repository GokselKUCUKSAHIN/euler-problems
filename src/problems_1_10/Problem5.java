package problems_1_10;

public class Problem5
{
  /*
  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

  Answer = 232792560;
  */
  static int count = 0;
  private static int gcd(int a, int b)
  {
    if (b > a)
    {
      int temp = a;
      a = b;
      b = temp;
    }
    int m = a % b;
    if (m == 0) return b;
    return gcd(b, m);
  }

  public static int eulerProblem5Optimized()
  {
    int num = 2520;
    for (int i = 11; i < 21; i++) num *= i / gcd(i, num);
    return num;
  }

  public static int eulerProblem5()
  {
    for (int i = 2520; i < 1_000_000_000; i++)
    {
      if (testIt(i, 20))
      {
        return i;
      }
    }
    return 0;
  }

  private static boolean testIt(int number, int limit)
  {
    boolean state = true;
    for (int i = limit; i >= 2 && state; i--)
    {
      state = (number % i) == 0;
    }
    return state;
  }
}
