public class Kata {
  public static String[] capMe(String[] strings) {
        String[] result = new String[strings.length];
        int k=0;
        for(String str : strings) {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                throw new IllegalArgumentException("Input array contains null elements");
            }
            for (int i=0;i< str.length(); i++) {
                if(i==0){
                    sb.append(Character.toUpperCase(str.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(str.charAt(i)));
                }
            }
            result[k++] = sb.toString();
        }
        return result;
    }
}