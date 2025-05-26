import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
​
public class SortAndStar {
​
  public static String twoSort(String[] s) {
            Optional<String> first = Arrays.stream(s)
            .sorted()
            .findFirst()
            .map((String t) -> String.join("***", t.split("")));
        return first.orElse("");
  }
}