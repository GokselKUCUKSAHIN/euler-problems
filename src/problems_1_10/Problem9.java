package problems_1_10;

public class Problem9
{

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
