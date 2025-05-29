import java.util.Arrays;
public class Maps {
  public static int[] map(int[] arr) {
    return Arrays.stream(arr).map(p->p*2).toArray();
  }
}