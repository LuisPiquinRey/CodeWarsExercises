public class SpiralingBox
{
      public static int[][] createBox(int width, int length)
    {      
      int[][] result = new int[length][width];
        int n = 0;
        while (n <= width / 2) {
            for (int i = n; i < length - n; i++) {
                for (int j = n; j < width - n; j++) {
                    result[i][j] += 1;
                }
            }
            n++;
        }      
      
      return result;
    }
}