public class Stairs{
      public static String draw(int n) {
        StringBuilder str = new StringBuilder();
        String newline = System.lineSeparator();
​
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                str.append(" "); 
            }
            str.append("I");
            if (i < n - 1) {
                str.append(newline);
            }
        }
        return str.toString();
    }
}