public class MonkeyCounter {
​
  public static int[] monkeyCount(final int n) {
    return fill(1, n, new int[n]);
  }
​
  private static int[] fill(int current, int max, int[] arr) {
    if (current > max) return arr;
    arr[current - 1] = current;
    return fill(current + 1, max, arr);
  }
}