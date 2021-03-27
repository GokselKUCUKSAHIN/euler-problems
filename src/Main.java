import problems_11_20.Problem11;
import problems_1_10.*;

public class Main
{

  public static void main(String[] args)
  {
    problems_1_10();
    problems_11_20();
  }

  private static void problems_1_10()
  {
    // System.out.println(Problem1.eulerProblem1BruteForce());
    System.out.println(Problem1.eulerProblem1Optimized());
    System.out.println(Problem2.eulerProblem2());
    System.out.println(Problem3.eulerProblem3());
    System.out.println(Problem4.eulerProblem4());
    // System.out.println(Problem5.eulerProblem5());
    System.out.println(Problem5.eulerProblem5Optimized());
    System.out.println(Problem6.eulerProblem6());
    System.out.println(Problem7.eulerProblem7());
    System.out.println(Problem8.eulerProblem8());
    System.out.println(Problem9.eulerProblem9());
    System.out.println(Problem10.eulerProblem10());
  }

  private static void problems_11_20()
  {
    System.out.println(Problem11.eulerProblem11());
  }
}
