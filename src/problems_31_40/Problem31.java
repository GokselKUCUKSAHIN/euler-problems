package problems_31_40;

import java.util.HashMap;
import java.util.Map;

public class Problem31
{
  /*
  In the United Kingdom the currency is made up of pound (£) and pence (p). There are eight coins in general circulation:

  1p, 2p, 5p, 10p, 20p, 50p, £1 (100p), and £2 (200p).
  It is possible to make £2 in the following way:

  1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p

  How many different ways can £2 be made using any number of coins?

  Solution: 73682
  */

  private enum Coin
  {
    C200((short) 200, null),
    C100((short) 100, C200),
    C50((short) 50, C100),
    C20((short) 20, C50),
    C10((short) 10, C20),
    C5((short) 5, C10),
    C2((short) 2, C5),
    C1((short) 1, C2),
    ;

    private final short value;
    private final Coin next;

    public short getValue()
    {
      return this.value;
    }

    public Coin getNext()
    {
      return this.next;
    }

    Coin(short value, Coin next)
    {
      this.value = value;
      this.next = next;
    }
  }

  private static Map<String, Integer> cache = new HashMap<String, Integer>();

  private static int dfs(Coin coin, int remaining)
  {
    if (remaining == 0)
    {
      return 1;
    }

    if (coin == null || remaining < 0)
    {
      return 0;
    }

    String key = String.format("%d_%d",  coin.getValue(), remaining);
    int cachedResult = cache.getOrDefault(key, -1);
    if (cachedResult != -1) {
      return cachedResult;
    }

    int count = 0;

    count += dfs(coin, remaining - coin.getValue());

    count += dfs(coin.getNext(), remaining);

    cache.put(key, count);

    return count;
  }


  public static int eulerProblem31()
  {
    short target = 200;
    Coin start = Coin.C1;
    return dfs(start, target);
  }
}