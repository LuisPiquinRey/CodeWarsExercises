public class EightiesKids2 {
      public static String findSpaceship(String map) {
        if(!map.contains("X")) return "Spaceship lost forever.";
        String[] split = map.split("\n");
        int fila = -1;
        int columna = -1;
        for(int i = 0; i < split.length; i++) {
            int row = split.length - 1 - i;
            int col = split[row].indexOf('X');
            if(col != -1) {
                fila = i;
                columna = col;
                break;
            }
        }
        return "[" + columna + ", " + fila + "]";
    }
}