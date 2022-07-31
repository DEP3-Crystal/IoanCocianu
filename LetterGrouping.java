package crystal.training;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class LetterGrouping {
  static final String VOCALS = "aeiou";

  static String myText = "There also could occur errors during search or poison application Or the search could take a very long time because the ants hide very well";
  static String text = "abasd";
  public static void main(String[] args) {
    Map<String, Long> res = Arrays.stream(myText.split(""))
        .collect((Collectors.groupingBy(c -> "aeiou".indexOf(c) >= 0 ? "vocals":"non vocals", Collectors.counting())));
    System.out.println(res);
    //Exercise -
    // Calculate the sum of the char values
    // Calculate the sum of the char positions
    // A op B = B op A     AND  A op (B op C) = (A op C) op C

    //SUM OF CHAR VALUES
    int sumAscii=0;
    sumAscii = myText.chars()
            .sum();
    System.out.println("The ASCII sum of charachters is:" + sumAscii);

    //SUM OF CHAR POSITIONS
    int sumPositions=myText.length()*(myText.length()+1)/2;
    System.out.println("The positions sum of charachters is:" +sumPositions);







  }
}
