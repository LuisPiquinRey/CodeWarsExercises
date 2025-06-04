import java.util.ArrayList;
import java.util.List;
public class Solution {
      public static List<Integer> notPrimes(int a, int b) {
        List<Integer> solution = new ArrayList<>();
        String primeDigits = "2357";
        
        for (int i = a; i < b; i++) {
            String numberStr = String.valueOf(i);
            boolean allDigitsPrime = true;
            
            for (char c : numberStr.toCharArray()) {
                if (primeDigits.indexOf(c) == -1) {
                    allDigitsPrime = false;
                    break;
                }
            }
​
            if (!allDigitsPrime) continue;
​
            if (!isPrime(i)) {
                solution.add(i);
            }
        }
​
        return solution;
    }
​
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}