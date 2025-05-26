import java.util.List;
class Kata {
   public static List<String> friend(List<String> x){
     return x.stream().filter(p->p.length()==4).toList();
   }
}