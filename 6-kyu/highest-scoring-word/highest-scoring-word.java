public class Kata {
​
  public static String high(String s) {
        String[] arrString = s.split(" ");
        String maxWord = "";
        int maxValueWord = 0;
​
        for (String word : arrString) {
            int valueWord = 0;
            char[] arr = word.toCharArray();
​
            for (char c : arr) {
                valueWord += c - 'a' + 1;
            }
​
            if (valueWord > maxValueWord) {
                maxValueWord = valueWord;
                maxWord = word;
            }
        }
​
        return maxWord;
    }
}