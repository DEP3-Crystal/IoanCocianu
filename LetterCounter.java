package crystal.training;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LetterCounter {
  static final String VOCALS = "aeiou";

  static String myText = "There also could occur errors during search or poison application Or the search could take a very long time because the ants hide very well";

  public static void main(String[] args) {

    //OG METHOD
    System.out.println(Arrays.toString(myText.split("")));

    // TO DO - find 2 other ways to create a stream of chars from a string !!!!

    // METHOD 1  using chars()
    Stream<Character> characterStream = myText.chars()
            .mapToObj(c -> (char) c);
    characterStream.forEach(System.out::println);


    // METHOD 2 using codePoints()
    IntStream intStream = myText.codePoints();
    Stream<Character> characterStream2
            = myText.codePoints().mapToObj(c -> (char) c);
    characterStream2.forEach(System.out::println);


    long vc = Arrays.stream(myText.split(""))
        .filter(l -> VOCALS.indexOf(l) >= 0)
        .count();
    System.out.println(vc);
    System.out.println(myText.length() - vc);
    System.out.println(Arrays.stream(myText.split(""))
        .filter(l -> VOCALS.indexOf(l) < 0)
        .count());
  }
}
