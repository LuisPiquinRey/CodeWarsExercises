public class Kata {
      public static double heron(double a, double b, double c)
    {
        double s=(a+b+c)/2;
        return Math.sqrt((double)(s * (s - a) * (s - b) * (s - c)));
    }
}