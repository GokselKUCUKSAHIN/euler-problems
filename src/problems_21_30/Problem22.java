package problems_21_30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem22
{

  /*
  Using 'names.txt' (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand
  first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each
  name, multiply this value by its alphabetical position in the list to obtain a name score.

  For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53,
   is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

  What is the total of all the name scores in the file?

  Answer = 871198282
   */

  private static String readFile()
  {
    try (BufferedReader br = new BufferedReader(new FileReader("src/problems_21_30/file/names.txt")))
    {
      StringBuilder readedFile = new StringBuilder();
      String line;
      while ((line = br.readLine()) != null)
      {
        readedFile.append(line.trim());
      }
      return readedFile.toString();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    return "NOT FOUND ERROR";
  }

  private static String[] parseCSV(String line)
  {
    return line.split(",");
  }

  private static String[] cleanCSV(String[] csvArray)
  {
    for (int i = 0; i < csvArray.length; i++)
    {
      csvArray[i] = csvArray[i].substring(1, csvArray[i].length() - 1);
    }
    return csvArray;
  }

  private static int getAlphabeticValue(char chr)
  {
    int value = Character.valueOf(chr);
    if (value >= 65 && value <= 90)
    {
      return value - 64;
    }
    return 0;
  }

  private static int getStringNumericScore(String word)
  {
    int sum = 0;
    for (int i = 0; i < word.length(); i++)
    {
      sum += getAlphabeticValue(word.charAt(i));
    }
    return sum;
  }

  public static int eulerProblem22()
  {
    List<String> list = Arrays.asList(cleanCSV(parseCSV(readFile())));
    Collections.sort(list);
    int score = 0;
    for (int i = 0; i < list.size(); i++)
    {
      score += (i + 1) * getStringNumericScore(list.get(i));
    }
    return score;
  }
}