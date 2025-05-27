import java.util.Map;
import java.util.HashMap;
​
public class Kata {
      public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        str.chars()
            .mapToObj(c -> (char) c)
            .forEach(c -> map.merge(c, 1, Integer::sum));
        return map;
    }
}