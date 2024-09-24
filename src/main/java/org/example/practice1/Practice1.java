package org.example.practice1;

import java.util.Scanner;

public class Practice1 {
    /**
     * Thay đổi ký tự đặc biệt trong 1 chuỗi cho trước:
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String string = scanner.next();
        System.out.println("After replace 1 special character");
        System.out.println(Practice1.changeSpecialCharacter(string));
        System.out.println("After replace all special character");
        System.out.println(Practice1.changeAllSpecialCharacter(string));
    }

    public static String changeSpecialCharacter (String string) {
        return string.replace("@", "_");
    }

    public static String changeAllSpecialCharacter (String string) {
        return string.replaceAll("[%^#$()!_+@~]", "");
    }
}

