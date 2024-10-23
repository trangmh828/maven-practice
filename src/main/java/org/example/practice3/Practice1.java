package org.example.practice3;

public class Practice1 {
    /**
     * Thay đổi ký tự đặc biệt trong 1 chuỗi cho trước:
     */
    public static void main(String[] args) {
        String output = changeSpecialCharacter("hello@ test");
        System.out.println(output);
    }

    private static String changeSpecialCharacter(String input) {
        return input.replace("@", "");
    }
}
