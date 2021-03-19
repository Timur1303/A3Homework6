package kg.app.a3homework6.domain;

public class Math {


    public int add (int a, int b){
        return a + b;
    }

    public int div (int a, int b){
        return a / b;
    }

    public int sub (int a, int b){
        return a - b;
    }

    public int mul (int a, int b){
        return a * b;
    }

    public String reverseWords(String str) {
        String[] strings = String.valueOf(str).split(" ");
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
