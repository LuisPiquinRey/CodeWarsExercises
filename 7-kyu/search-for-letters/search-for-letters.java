import java.util.Arrays;
public class Letters{
      public static String search(String line){
        int[] abc=new int[26];
        line=line.toLowerCase();
        for(int i=0;i<line.length();i++){
            int sect=line.charAt(i);
            if(Character.isAlphabetic(sect)){
                int num=sect-'a';
                abc[num]=1;
            }
        }
        String solution="";
        for(int numArray:abc){
            solution+=numArray;
        }
        return solution;
    }
}