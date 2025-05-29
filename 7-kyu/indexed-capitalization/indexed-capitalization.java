package kata;
​
public class Solution{
      public static String capitalize(String s, int[] ind) {
        char[] chars = s.toCharArray();
        for (int pos : ind) {
            if (pos >= 0 && pos < chars.length) {
                chars[pos] = Character.toUpperCase(chars[pos]);
            }
        }
        return new String(chars);
    }
}