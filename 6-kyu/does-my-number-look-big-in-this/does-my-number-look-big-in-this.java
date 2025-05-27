import java.util.stream.Stream;
public class NumberUtils {
      public static boolean isNarcissistic(int number) {
        int numDigits = String.valueOf(number).length();
​
        int sum = String.valueOf(number)
                .chars()
                .map(c -> Character.getNumericValue(c))
                .map(d -> (int) Math.pow(d, numDigits))
                .sum();
        return sum == number;
    }
}