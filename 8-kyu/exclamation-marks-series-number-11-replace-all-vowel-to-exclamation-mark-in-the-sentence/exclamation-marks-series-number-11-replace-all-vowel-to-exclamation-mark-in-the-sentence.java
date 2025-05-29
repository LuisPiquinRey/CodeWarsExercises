import java.util.Arrays;
public class Solution {
      public static String replace(final String s) {
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (vowels.contains(String.valueOf(arr[i]))) {
                arr[i] = '!';
            }
        }
        return new String(arr);
    }
}