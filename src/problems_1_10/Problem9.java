package problems_1_10;

public class Problem9
{
  /*
  A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

  a^2 + b^2 = c^2
  For example, 3^2 + 4^22 = 9 + 16 = 25 = 5^2.

  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  Find the product abc.

  Answer = 31875000
  a = 200, b = 375, c = 425
  */
  public static int eulerProblem9()
  {
    for (int c = 1; c <= 1000; c++)
      for (int b = 0; b < c; b++)
        for (int a = 0; a < b; a++)
          if (sumRule(a, b, c) && pythagoreanRule(a, b, c))
          {
            System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
            return a * b * c;
          }
    return 0;
  }

  public static boolean sumRule(int a, int b, int c)
  {
    return 1000 == a + b + c;
  }

  public static boolean pythagoreanRule(int a, int b, int c)
  {
    return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
  }
}
