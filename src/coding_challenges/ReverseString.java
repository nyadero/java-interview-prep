package coding_challenges;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(reverseStringLoop("hello"));
    }

    public static String reverseStringLoop(String s){
        StringBuilder reversedString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString.append(s.charAt(i));
        }
        return reversedString.toString();
    }

    public static String reverseString(String s) {
        StringBuilder reversedString = new StringBuilder(s);
        return reversedString.reverse().toString();
    }

}
