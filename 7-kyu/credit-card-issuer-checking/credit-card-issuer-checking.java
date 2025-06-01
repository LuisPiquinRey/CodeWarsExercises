public class Kata {
          public static String getIssuer(String cardNumber) {
        if ((cardNumber.startsWith("34")|| cardNumber.startsWith("37")) && cardNumber.length()==15) {
            return "AMEX";
        }else if(cardNumber.startsWith("6011") && cardNumber.length()==16){
            return "Discover";
        }else if(cardNumber.matches("^5[1-5].{14}$")){
            return "Mastercard";
        }else if(cardNumber.startsWith("4")&&(cardNumber.length()==13 || cardNumber.length()==16)){
            return "VISA";
        }
        return "Unknown";
    }
}