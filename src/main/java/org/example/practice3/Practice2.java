package org.example.practice3;

import org.apache.commons.exec.util.StringUtils;

public class Practice2 {
    /**
     Lấy 4 ký tự cuối cùng của một chuỗi cho trước
     */
    public static void main(String[] args) {
        String input = "hello world";
        String lastFourCharacter1 = getLastFourCharacter1(input);
        String lastFourCharacter2 = getLastFourCharacter2(input);
        String lastFourCharacter3 = getLastFourCharacter3(input);
        String lastFourCharacter4 = getLastFourCharacter4(input);
        printString("using subString: " + lastFourCharacter1);
        printString("using char array: " + lastFourCharacter2);
        printString("using for loop: " + lastFourCharacter3);
        printString("using StringBuilder: " + lastFourCharacter4);
    }

    private static String getLastFourCharacter1(String input) {
        if (input.length() < 4) return "Not enough character to get";
        return input.substring(input.length() - 4);
    }

    private static String getLastFourCharacter2(String input) {
        if (input.length() < 4) return "Not enough character to get";
        char[] charArray = input.toCharArray();
        String output = new String(charArray, charArray.length - 4, 4);
        return output;
    }

    private static String getLastFourCharacter3(String input) {
        if (input.length() < 4) return "Not enough character to get";
        String lastFourChars = "";
        for (int i = input.length() - 4; i < input.length(); i++) {
            lastFourChars += input.charAt(i);
        }
        return lastFourChars;
    }

    private static String getLastFourCharacter4(String input) {
        if (input.length() < 4) return "Not enough character to get";
        StringBuilder newString = new StringBuilder();
        for (int i = input.length() - 4; i < input.length(); i++) {
            newString.append(input.charAt(i));
        }
        return newString.toString();
    }

    private static void printString (String input) {
        System.out.println(input);
    }
}
