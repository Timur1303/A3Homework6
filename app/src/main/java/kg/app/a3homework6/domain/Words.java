package kg.app.a3homework6.domain;

 public class Words {

     public String reverseWord(String word) {
         String[] strings = String.valueOf(word).split("\\ ");
         String reversedWord = "";
         int k = strings.length - 1;
         if (strings.length > 1) {
             for (int i = 1; i < strings.length; i++) {
                 strings[i] = strings[i] + " ";
             }
         }
         for (int i = k; i >= 0; i--) {
             reversedWord = reversedWord + strings[i];
         }
         return reversedWord;
     }
}
