public class InterviewQuestion {
    public static void main(String[] args) {
        System.out.println(removePairs("aaabbbcc"));
    }

        public static String removePairs(String input){
           if (input.length() < 2){
               return input;
           }

           if (input.charAt(0) == input.charAt(1)){
               return removePairs(input.substring((2)));
           } else {
               return input.charAt(0) + removePairs(input.substring(1));
           }
        }

}
