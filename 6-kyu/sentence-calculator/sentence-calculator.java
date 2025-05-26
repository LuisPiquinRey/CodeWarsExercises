public class SentenceCalculator{
    public static int lettersToNumbers(String s){
        char[] ch=s.toCharArray();
        int sum=0;
        for(char c: ch){
            if(Character.isLetter(c)){
                if(c >= 'A' && c <= 'Z') sum+= (c-'A'+1)*2;
                if(c >= 'a' && c <= 'z') sum+= c-'a' + 1;
            }else if(Character.isDigit(c)){
                sum += c - '0';
            } else {
                sum += 0;
            }
        }
        return sum;
    }
}