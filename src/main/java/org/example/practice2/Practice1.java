package org.example.practice2;

public class Practice1 {
    /**
     * Thay đổi ký tự đặc biệt trong 1 chuỗi cho trước:
     */

    public String changeTheSpecialCharacter (String str) {
        return str.replace("@","");
    }

    public String changeTheSpecialCharacter1 (String str) {
            return str.replaceAll("[!@#$%^]","");
    }

    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        String test1 = p1.changeTheSpecialCharacter("test238472!@#$%^test");
        System.out.println(test1);
        String test2 = p1.changeTheSpecialCharacter1("test238472!@#$%^test");
        System.out.println(test2);
    }
}
