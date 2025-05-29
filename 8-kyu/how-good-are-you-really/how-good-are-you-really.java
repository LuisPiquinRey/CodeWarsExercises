import java.util.Arrays;
public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return yourPoints>Arrays.stream(classPoints).summaryStatistics().getAverage();
  }
}