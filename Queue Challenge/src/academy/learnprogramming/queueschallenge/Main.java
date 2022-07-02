package academy.learnprogramming.queueschallenge;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

//    public static boolean checkForPalindrome(String string) {
//        String stringNoPunctuation = string.toLowerCase().replaceAll("\\W", "");
//        StringBuilder reverseStr = (new StringBuilder(stringNoPunctuation.length())).append(stringNoPunctuation).reverse();
////        System.out.println(reverseStr);
////        System.out.println(stringNoPunctuation);
//        return reverseStr.toString().equals(stringNoPunctuation);
//    }

    public static boolean checkForPalindrome(String string) {
        LinkedList queue = new LinkedList();
        String stringNoPunctuation = string.toLowerCase().replaceAll("\\W", "");
        StringBuilder reverseStr = new StringBuilder(stringNoPunctuation.length());
        for(int i = stringNoPunctuation.length() - 1; i >= 0; i--) {
            queue.add(stringNoPunctuation.charAt(i));
        }
        for (int i = 0; i < stringNoPunctuation.length(); i++) {
            reverseStr.append(queue.removeFirst());
        }

//        System.out.println(reverseStr);
//        System.out.println(stringNoPunctuation);
        return reverseStr.toString().equals(stringNoPunctuation);
    }
}
