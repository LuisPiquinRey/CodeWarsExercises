public class Solution {
      public static int substringCount(String fullText, String search) {
        if (search.isEmpty()) return 0;
        int count = 0;
        int idx = 0;
        while ((idx = fullText.indexOf(search, idx)) != -1) {
            count++;
            idx += search.length();
        }
        return count;
    }
}