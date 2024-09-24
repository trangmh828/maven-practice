package org.example;

public class Homework1 {
    /**
     * ## Password Complexity
     * * len > 8 characters
     * * include number
     * * include lowercases
     * * include uppercases
     * * include !@#$%^&*()
     * * * **create a function**: *
     * * - String as input
     * * - Boolean as output
     */

    public static boolean isPassword (String input) {
        return input.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{9,}");
    }

    public static void main(String[] args) {
        isPassword("Trang123456a$");
    }
}
