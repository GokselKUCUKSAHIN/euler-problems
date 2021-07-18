package problems_11_20;

public class Problem12
{

  /*
  The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

  1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

  Let us list the factors of the first seven triangle numbers:

   1: 1
   3: 1,3
   6: 1,2,3,6
  10: 1,2,5,10
  15: 1,3,5,15
  21: 1,3,7,21
  28: 1,2,4,7,14,28
  We can see that 28 is the first triangle number to have over five divisors.

  What is the value of the first triangle number to have over five hundred divisors?

  Answer = 76576500
   */

  public static int eulerProblem12()
  {
    int current = 0;
    boolean isFounded = false;
    for (int i = 1; !isFounded; i++)
    {
      current += i;
      int limit = (int) Math.sqrt(current);
      int divisor = 0;
      for (int j = 1; j <= limit; j++)
      {
        if (current % j == 0)
        {
          divisor += 2;
        }
      }
      isFounded = divisor > 500;
    }
    return current;
  }
}

/*
* // 313112800
    // System.out.println(Arrays.toString(getAllFactorsOpt(20)));
    int[] triangleNumbers = getTriangeleArray(26_000);
    for (int i = 25_000; i < 26_000; i++)
    {
      int tri = triangleNumbers[i];
      // int[] factors = getAllFactorsOpt(tri);
      int factor = getFactorLength(tri);
      System.out.println(factor);
      if (factor > 500)
      {
        System.out.println(i);
        System.out.println(triangleNumbers[i+1]);
        System.out.println(tri);
        System.out.println(factor);
        return tri;
      }
    }
    return 0;*/