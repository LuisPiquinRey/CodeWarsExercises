import java.util.Set;
import java.util.HashSet;
​
public class CountingDuplicates {
   public static int duplicateCount(String text) {
        text = text.toLowerCase();
​
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
​
        for (char c : text.toCharArray()) {
            if (seen.contains(c)) {
                duplicates.add(c);
            } else {
                seen.add(c);
            }
        }
​
        return duplicates.size();
    }
}