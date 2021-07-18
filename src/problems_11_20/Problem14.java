package problems_11_20;

public class Problem14
{

  /*
  The following iterative sequence is defined for the set of positive integers:

  n → n/2 (n is even)
  n → 3n + 1 (n is odd)

  Using the rule above and starting with 13, we generate the following sequence:

  13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
  It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

  Which starting number, under one million, produces the longest chain?

  NOTE: Once the chain starts the terms are allowed to go above one million.

  Answer = 837799
   */

  private static long collatz(long num)
  {
    return (num & 0x1) == 0 ? num / 2 : 3 * num + 1;
  }

  private static int countChain(int startPoint)
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