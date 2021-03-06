package problems_1_10;

public class Problem1
{

  /*
  If we list all the natural numbers below 10 that are multiples of
  3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000.
  // Answer = 233168
  */

  public static int eulerProblem1Optimized()
  {
    int sum = 0;
    for (int i = 3; i < 1000; i += 3) sum += i;
    for (int i = 5; i < 1000; i += 5) sum += i;
    for (int i = 15; i < 1000; i += 15) sum -= i;
    return sum;
  }

  public static int eulerProblem1BruteForce()
  {
    int sum = 0;
    for (int i = 999; i > 0; i--)
    {
      if (i % 3 == 0)
      {
        sum += i;
      } else if (i % 5 == 0)
      {
        sum += i;
      }
    }
    return sum;
  }
}