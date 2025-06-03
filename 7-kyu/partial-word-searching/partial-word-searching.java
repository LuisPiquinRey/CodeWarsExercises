import java.util.Arrays;
class WordSearch {
      static String[] findWord(String x, String[] y){
        String[] result = Arrays.stream(y)
            .filter(p -> p.toLowerCase().contains(x.toLowerCase()))
            .toArray(String[]::new);
        if (result.length == 0) {
            return new String[]{"Empty"};
        }
        return result;
    }
}