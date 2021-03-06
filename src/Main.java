import problems_11_20.*;
import problems_1_10.*;
import problems_21_30.Problem22;
import problems_21_30.Problem25;
import problems_31_40.Problem35;
import problems_31_40.Problem37;
import problems_41_50.Problem45;
import problems_41_50.Problem48;

public class Main implements Cloneable
{

  public static void main(String[] args)
  {
    problems_1_10();
    problems_11_20();
    problems_21_30();
    problems_31_40();
    problems_41_50();
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
    System.out.println(Problem12.eulerProblem12());
    System.out.println(Problem13.eulerProblem13());
    System.out.println(Problem14.eulerProblem14());
    System.out.println(Problem18.eulerProblem18());
    System.out.println(Problem20.eulerProblem20());
  }

  private static void problems_21_30()
  {
    System.out.println(Problem22.eulerProblem22());
    System.out.println(Problem25.eulerProblem25());
  }

  private static void problems_31_40()
  {
    System.out.println(Problem35.eulerProblem35());
    System.out.println(Problem37.eulerProblem37());
  }

  private static void problems_41_50()
  {
    System.out.println(Problem45.eulerProblem45());
    System.out.println(Problem48.eulerProblem48());
  }
}
