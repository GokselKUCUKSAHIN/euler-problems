package problems_1_10;

public class Problem3
{

  public static long problem3()
  {
    long curr = 600851475143L, div = 2, largestDiv = -1;
    do if (curr % div == 0) {
      curr /= div;
      if (div > largestDiv)
        largestDiv = div;
      div = 2;
    } else
      div = div == 2 ? 3 : div + 2; // Check only odd numbers (except 2)
    while (curr != 1);
    return largestDiv;
  }
}