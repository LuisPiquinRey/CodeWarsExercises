public class Kata
{
      public static int[] countPositivesSumNegatives(int[] input){
        int sumNegatives = 0;
        int sumPositives = 0;
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        for(int value: input) {
            if(value > 0) {
                sumPositives++;
            } else if(value < 0) {
                sumNegatives += value;
            }
        }
        return new int[]{sumPositives, sumNegatives};
    }
}