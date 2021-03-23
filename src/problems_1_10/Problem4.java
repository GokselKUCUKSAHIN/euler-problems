package problems_1_10;

public class Problem4
{
  /*
  A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

  Find the largest palindrome made from the product of two 3-digit numbers.

  Answer = 906609
  */

  public static int eulerProblem4()
  {
    int biggest = -1;
    StringBuilder sb = new StringBuilder();
    for (int i = 999; i > 100; i--)
    {
      for (int j = i; j >= 100; j--)
      {
        int multi = i * j;
        sb.setLength(0);
        sb.append(multi);
        if (sb.toString().equals(sb.reverse().toString()))
        {
          // it's Palindrome
          if (multi > biggest)
          {
            biggest = multi;
          }
        }
      }
    }
    return biggest;
  }
}
