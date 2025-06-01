class Solution {
      public static String calc(String txt){
        String[] arr=txt.split(" ");
        int firstNumber=arr[0].length();
        int secondNumber=arr[2].length();
        switch(arr[1]){
            case "+" -> {
                return arr[0]+arr[2];
            }
            case "-"->{
                int solution=firstNumber-secondNumber;
                return ".".repeat(solution);
            }
            case "*"->{
                int solution=firstNumber*secondNumber;
                return ".".repeat(solution);
            }
            case"//"->{
                int solution=firstNumber/secondNumber;
                return ".".repeat(solution);
            }
        }
        return "";
    }
}