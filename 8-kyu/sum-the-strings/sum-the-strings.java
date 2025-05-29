public class Kata{
      public static String sumStr(String a, String b){
        int numA;
        int numB;
        if(!a.isEmpty()){
            numA=Integer.parseInt(a);
        }else{
            numA=0;
        }
        if(!b.isEmpty()){
            numB=Integer.parseInt(b);
        }else{
            numB=0;
        }
        return (numA+numB)+"";
    }
 
}