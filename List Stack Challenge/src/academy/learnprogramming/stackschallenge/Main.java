package academy.learnprogramming.stackschallenge;

import java.util.*;

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
//        String abc = "I did, did I?";
//        String[] array = abc.split("\\W");
//        String string = String.join("", array);
//        System.out.println(string);
    }

//    public static boolean checkForPalindrome(String string) {
//        LinkedList<Character> stack = new LinkedList<>();
//        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
//        String lowerCase = string.toLowerCase();
//
//        for(int i = 0; i < lowerCase.length(); i++) {
//            char c = lowerCase.charAt(i);
//            if(c >= 'a' && c <= 'z') {
//                stringNoPunctuation.append(c);
//                stack.push(c);
//            }
//        }
//
//        StringBuilder reversedString = new StringBuilder(stack.size());
//        while(!stack.isEmpty()) {
//            reversedString.append(stack.pop());
//        }
//
//        System.out.println(reversedString);
//        System.out.println(stringNoPunctuation);
//        return reversedString.toString().equals(stringNoPunctuation.toString());
//        return reversedString.equals(stringNoPunctuation);
//    }

//    public static boolean checkForPalindrome(String string) {
//        String stringNoPunctuation = string.toLowerCase().replaceAll("\\W", "");
////        System.out.println("String no puncuation: " + stringNoPunctuation);
//        LinkedList<Character> stack = new LinkedList<>();
//        for(int i = 0; i < stringNoPunctuation.length(); i++) {
//            char c = stringNoPunctuation.charAt(i);
//            stack.push(c);
//        }
//
//        StringBuilder reversedString = new StringBuilder(stack.size());
//        while(!stack.isEmpty()) {
//            reversedString.append(stack.pop());
//        }
//
////        System.out.println("ReversedString: " + reversedString);
//
//
//        return stringNoPunctuation.equals(reversedString.toString());
//    }

    public static boolean checkForPalindrome(String string) {
        String stringNoPunctuation = string.toLowerCase().replaceAll("\\W", "");
        StringBuilder reversedString = (new StringBuilder(stringNoPunctuation.length())).append(stringNoPunctuation).reverse();
        return stringNoPunctuation.equals(reversedString.toString());
    }
}


