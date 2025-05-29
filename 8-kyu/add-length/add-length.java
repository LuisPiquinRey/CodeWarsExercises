import java.util.Arrays;
public class AddLength{
    public static String[] addLength(String str){
        return Arrays.stream(str.split(" "))
                .map(p -> p + " " + p.length())
                .toArray(String[]::new);
    }
  
}