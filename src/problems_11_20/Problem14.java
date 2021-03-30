package problems_11_20;

public class Problem14
{

  private static long collatz(long num)
  {
    return (num & 0x1) == 0 ? num / 2 : 3 * num + 1;
  }

  public static int countChain(int startPoint)
  {
    int count = 0;
    long current = startPoint;
    while (current != 1)
    {
      current = collatz(current);
      count++;
    }
    return count;
  }

  public static int eulerProblem14()
  {
    int max = -1;
    int maxCount = -1;
    for (int i = 999_999; i >= 1; i--)
    {
      int c = countChain(i);
      if (c > maxCount)
      {
        maxCount = c;
        max = i;
      }
    }
    return max;
  }
}
